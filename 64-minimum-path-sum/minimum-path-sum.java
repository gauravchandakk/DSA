class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }


        return sum(0,0,grid,m,n,dp);
    }
    int sum(int i,int j,int[][] grid,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1)
        return grid[i][j];
        if(dp[i][j]!=-1)
        return  dp[i][j];
        if(i==m-1){
            return dp[i][j]=grid[i][j]+sum(i,j+1,grid,m,n,dp);
        }
        if(j==n-1){
            return dp[i][j]=grid[i][j]+sum(i+1,j,grid,m,n,dp);
        }
        return dp[i][j]=grid[i][j]+Math.min(sum(i+1,j,grid,m,n,dp),sum(i,j+1,grid,m,n,dp));
    }
}