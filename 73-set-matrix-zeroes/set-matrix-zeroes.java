class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> r=new HashSet<>();
        HashSet<Integer> c=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            boolean b=false;
            if(r.contains(i)){
               b=true;
            }
            
            for(int j=0;j<matrix[i].length;j++){
                if(c.contains(j)){
                    matrix[i][j]=0;
                }
                if(b==true){
                    matrix[i][j]=0;
                }
                
            }
        }
        
    }
}