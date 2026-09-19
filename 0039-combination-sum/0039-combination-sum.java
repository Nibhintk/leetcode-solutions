class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        
        backTrack(0,target,candidates,new ArrayList<>(),result);
        return result;
    }
    public static void backTrack(int idx,int target,int []candidates,List<Integer>list,List<List<Integer>>result){
        
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(idx==candidates.length || target<0){
            return;
        }
        list.add(candidates[idx]);
        backTrack(idx,target-candidates[idx],candidates,list,result);
        list.remove(list.size()-1);
        backTrack(idx+1,target,candidates,list,result);

    }

}