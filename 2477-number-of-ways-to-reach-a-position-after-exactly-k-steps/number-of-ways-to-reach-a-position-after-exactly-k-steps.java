class Solution {
    public int numberOfWays(int startPos, int endPos, int k) {
        if(Math.abs(startPos-endPos)>k)
        return 0;
        long[][] dp=new long[2*k][2*k];
        for(long[] a:dp){

        Arrays.fill(a,-1);
        }
        return (int)numberOfWays(k,k+Math.abs(startPos-endPos),k,dp);


    }
    public long numberOfWays(int s, int e, int k,long[][] dp) {
        
        if(k<=0 && s==e)
        return 1;
        if(k<=0)
        return 0;
        if(dp[s][k]!=-1)
        return dp[s][k];
        dp[s][k]=numberOfWays(s-1,e,k-1,dp)+numberOfWays(s+1,e,k-1,dp);
        return dp[s][k]%1000000007;
    }
}