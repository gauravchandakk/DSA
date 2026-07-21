class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i=x;
        int a=x+k-1;
        int b=0;
        while(b<k/2){
            for(int j=y;j<y+k;j++){
                int temp =grid[i][j];
                grid[i][j]=grid[a][j];
                grid[a][j]=temp;
            }
            i++;
            a--;
            b++;
        }
        return grid;
    }
}