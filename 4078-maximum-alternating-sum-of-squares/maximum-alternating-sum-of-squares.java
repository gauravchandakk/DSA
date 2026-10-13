class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int count=nums.length/2;
        long sum=0;
        for(int i: nums){
            if(count>0){
                sum-=(long)(i*i);
                count--;
            }
            else{
                sum+=(long)(i*i);
            }
        }
        return sum;
    }
}