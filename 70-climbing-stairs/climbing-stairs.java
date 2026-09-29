class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        if(n>=2)
        dp[2]=2;
        return sol(n,dp);
    }
    int sol(int n,int[] dp){
        if(dp[n]!=-1)
        return  dp[n];
        dp[n]=sol(n-1,dp)+sol(n-2,dp);
        return dp[n];
    }
}