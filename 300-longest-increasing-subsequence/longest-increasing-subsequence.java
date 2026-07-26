class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        dp=subsequence(nums,dp,0);
        int max=0;
        for(int i:dp){
            max=Math.max(max,i);
        }
        return max;
    }
    int[] subsequence(int[] nums,int[] dp,int i){
        if(i>=nums.length)
        return dp;
        int max=-10001;
        for(int j=0;j<i;j++){
            if(nums[j]<nums[i]){
                max=Math.max(max,dp[j]);
            }
        }
        if(max!=-10001){
            dp[i]+=max;
        }
        return subsequence(nums,dp,i+1);
    }
}