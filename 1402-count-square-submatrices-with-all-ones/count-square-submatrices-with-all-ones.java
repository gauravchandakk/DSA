class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0)
                continue;
                if(i==0 || j==0)
                count+=matrix[i][j];
                else{
                    matrix[i][j]+=Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                    count+=matrix[i][j];
                }
            }
        }
        return count;
    }
}