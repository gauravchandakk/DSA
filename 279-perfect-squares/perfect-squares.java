class Solution {
    public int numSquares(int n){
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return numSquares(n,dp);
    }
    public int numSquares(int n,int[] dp) {
        if(isPerfect(n))
        return 1;
       
        if(dp[n-1]!=-1)
        return dp[n-1];
        int min=n;
        for(int i=1;i*i<=n/2;i++){
            int count=numSquares(i*i,dp)+numSquares(n-i*i,dp);
            min=Math.min(min,count);
        }
        return dp[n-1]=min;
    }
    boolean isPerfect(int n){
        int sqrt=(int)Math.sqrt(n);
        return (sqrt* sqrt== n);
    }
}