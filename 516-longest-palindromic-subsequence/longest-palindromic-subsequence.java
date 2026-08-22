class Solution {
    public int longestPalindromeSubseq(String s) {

        int m=s.length();
        if(m==1)
        return 1;
        if(m==2)
        return  s.charAt(0)==s.charAt(1)?2:1;
        int[][] dp=new int[m][m];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return max(s,dp,0,m-1);
    }
    int max(String s,int[][] dp,int i,int j){
        if(i>j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if( i==j)
            return dp[i][j]=1+max(s,dp,i+1,j-1);
        if(s.charAt(i)==s.charAt(j))
            return dp[i][j]=2+max(s,dp,i+1,j-1);
        return  dp[i][j]=Math.max(max(s,dp,i+1,j),max(s,dp,i,j-1));
    }
}