class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length-1;
        while(n>0){
            if(nums[n]<=nums[n-1]){
                return n;
            }
            n--;
        }
        return 0;
        
    }
}