class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        Integer[][] dp=new Integer[m][n];
        
        return max(text1,text2,0,0,dp);
    }
    int max(String text1,String text2,int i,int j,Integer[][] dp){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
           dp[i][j]= 1+max(text1,text2,i+1,j+1,dp);
        }
        else{
            dp[i][j]=Math.max(max(text1,text2,i+1,j,dp),max(text1,text2,i,j+1,dp));
        }
        return dp[i][j];
    }
}