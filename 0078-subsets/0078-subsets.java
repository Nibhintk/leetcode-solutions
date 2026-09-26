class Solution {
    public void backTrack(int idx,int[]nums,List<List<Integer>>result,List<Integer>list){
       
            result.add(new ArrayList(list));
        
        for(int i=idx;i<nums.length;i++){
            list.add(nums[i]);
            backTrack(i+1,nums,result,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        backTrack(0,nums,result,new ArrayList<>());
        return result;
    }
}