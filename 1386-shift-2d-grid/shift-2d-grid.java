class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> list=new ArrayList<>();
      
        while(k>0){
            int temp=grid[0][0];
            int temp2;
        for(int i=0;i<m;i++){
            
            for(int j=0;j< n;j++){
                if(j==n-1 && i==m-1){
                    grid[0][0]=temp;
                }
                else if(j==n-1){
                    temp2=grid[i+1][0];
                    grid[i+1][0]=temp;
                    temp=temp2;
                }
                else{
                    
                    temp2=grid[i][j+1];
                    grid[i][j+1]=temp;
                    temp=temp2;
                }
            }
        }
        k--;
        }
        for(int i=0;i<m;i++){
            List<Integer> list2=new ArrayList<>();
            for(int j=0;j< grid[i].length;j++){
                list2.add(grid[i][j]);
            }
            list.add(list2);
        }
        return list;

    }
}