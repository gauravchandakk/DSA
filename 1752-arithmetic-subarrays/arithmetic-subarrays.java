class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> listb = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            listb.add(list(nums,l[i],r[i]));
        }
        return listb;
    }
    Boolean list(int[] nums ,int l,int r){
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr, l, r+1);
        int  diff=arr[l+1]-arr[l];
        for(int i=l+1;i<r;i++){
           if(arr[i+1]-arr[i]!=diff)
           return false; 
        }
        return true;
    }
}