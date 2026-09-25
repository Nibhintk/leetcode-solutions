class Solution {
    public int maxProduct(int[] nums) {
        int maxP=nums[0];
        int minP=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            int temp=Math.max(x,Math.max(maxP*x,minP * x));
            minP=Math.min(x,Math.min(maxP * x,minP*x));
            maxP=temp;
            ans=Math.max(ans,maxP);
        }
        return ans;
    }
}