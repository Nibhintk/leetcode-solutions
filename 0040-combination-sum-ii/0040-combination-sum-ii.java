class Solution {
    public void backtrack(int i,int[]candidates,int target,List<Integer>list,List<List<Integer>>result){
        if(target==0){
            
                result.add(new ArrayList(list));
               
                return;
        }
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1])continue;
            if(candidates[j]>target)break;
            list.add(candidates[j]);
            backtrack(j+1,candidates,target-candidates[j],list,result);
            list.remove(list.size()-1);

        }
        
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,list,result);
        return result;
    }
}