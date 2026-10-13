class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][][]=new int[n][m][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return ans(grid,0,0,m-1,dp,n,m);
    }
    int ans(int[][] grid ,int i1,int j1, int j2,int[][][] dp,int n,int m){
        if(i1>= n  || j1>=m || j2>=m || j1<0 || j2<0){
            return Integer.MIN_VALUE;
        }
        if(dp[i1][j1][j2]!=-1){
            return dp[i1][j1][j2];
        }
        if(i1==n-1){
            if(j1==j2)
                return grid[i1][j1];
            else 
                return grid[i1][j1]+grid[i1][j2];
        }
        int max=Integer.MIN_VALUE;
        for(int i=-1;i<2;i++){
            for(int j=-1;j<2;j++){
                if(j1==j2){
                    max=Math.max(max,grid[i1][j1]+ans(grid,i1+1,j1+i,j2+j,dp,n,m));
                }
                else{
                    max=Math.max(max,grid[i1][j1]+grid[i1][j2]+ans(grid,i1+1,j1+i,j2+j,dp,n,m));
                    
                }
            }
        }
        return dp[i1][j1][j2]=max;

    }
}
