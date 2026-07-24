class Solution {
    public int rob(int[] nums) {
        int rob1=0;
        int rob2=0;
        int robbed=0;
        for(int i=0;i<nums.length;i++){
            robbed=Math.max(nums[i]+rob2,rob1);
            rob2=rob1;
            rob1=robbed;
            
        }
        return robbed;
    }
}