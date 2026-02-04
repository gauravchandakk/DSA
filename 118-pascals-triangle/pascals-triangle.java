class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int i=0;
        while(i<numRows){
            int col=(i+1);
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<col;j++){
                if(j==0 || j==col-1){
                    row.add(1);
                }
                else{
                    row.add(j,ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(row);
            i++;
            
        }
        return ans;
        
    }
}