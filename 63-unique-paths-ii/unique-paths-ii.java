class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1)
        return 0;
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1)
        return 0;
        

         int[][] dp=new int[m][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return paths(0,0,obstacleGrid,m,n,dp);

    }
    int paths(int i,int j, int[][] grid,int m,int n,int[][] dp){
        if(grid[i][j]==1)
        return 0;
        if(i==m-1 & j==n-1)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        else if(i==m-1)
        return dp[i][j]=paths(i,j+1,grid,m,n,dp);
        else if(j==n-1)
        return dp[i][j]=paths(i+1,j,grid,m,n,dp);
        return dp[i][j]=paths(i+1,j,grid,m,n,dp)+paths(i,j+1,grid,m,n,dp);
        
    }

}