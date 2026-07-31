class Solution {
    public int robber(int []rob,int s,int n){
        int rob2=0;
        int rob1=0;
        int robbed=0;
        for(int i=s;i<=n;i++){
            robbed=Math.max(rob1,rob[i]+rob2);
            rob2=rob1;
            rob1=robbed;
        }
        return robbed;
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int firstRob=robber(nums,0,nums.length-2);
        int secRob=robber(nums,1,nums.length-1);
        return Math.max(firstRob,secRob);
    }
}