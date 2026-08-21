class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1)
                obstacleGrid[i][j]=-1;
            }
        }
        return path(obstacleGrid,m-1,n-1);
    }
    int path(int[][] og,int i, int j){
        if(og[i][j]==-1){
            return 0;
        }
        if (og[i][j] != 0) {
            return og[i][j];
        }
        if(i==0 && j==0)
        return 1;
        if(i==0)
        og[i][j]=path(og,i,j-1);
        else if(j==0)
        og[i][j]= path(og,i-1,j);
        else
        og[i][j]= path(og,i-1,j)+path(og,i,j-1);
        return og[i][j];

    }
}