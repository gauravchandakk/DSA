class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=0;
        int dec=0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                dec=0;
            }
            else if(nums[i]<nums[i-1]){
                inc=0;
                dec++;
            }
            else{
                inc=0;
                dec=0;
            }
            ans=Math.max(ans,Math.max(inc,dec));
        }
        return ans+1;
    }
}