class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=100001;
        int sum=0;
        int left=0;
        int right=0;
        while(right<nums.length){
            if(sum+nums[right]<target){
                sum+=nums[right];
                right++;
            }
            else if(nums[right]>target){
                return  1;
            }
            else {

                 min=Math.min(min,right-left+1);
                sum-=nums[left];
                left++;
                 
                
            }
            
            
        }
        if(min!=100001)
        return min;
        return 0;
    }
}