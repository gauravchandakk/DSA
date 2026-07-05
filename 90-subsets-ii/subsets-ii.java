class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<>(),result,0);
        return result;
        
    }

    public void backtrack(int[] arr,List<Integer> temp,List<List<Integer>> result,int start) {
        
        result.add(new ArrayList<>(temp));
        
        
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i] == arr[i - 1]){
                
                continue;
            }else{
            temp.add(arr[i]);
            
            backtrack(arr,temp,result,i+1);
            
            temp.remove(temp.size()-1);
            }
        }
      
    }
}