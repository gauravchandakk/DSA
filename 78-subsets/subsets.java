class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result =new ArrayList<>();

        backtrack(arr,new ArrayList<>(),result,0);
        return result;
        
    }

    public void backtrack(int[] arr,List<Integer> temp,List<List<Integer>> result,int start) {
        
        result.add(new ArrayList<>(temp));
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            backtrack(arr,temp,result,i+1);
            temp.remove(temp.size()-1);
            
        }
       
    }

}