class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=nums.length-2;i>=0;i--){
            if(max2==Integer.MIN_VALUE && max!=nums[i])max2=nums[i];
            else if(max3==Integer.MIN_VALUE && max2!=nums[i] && max!=nums[i]) {max3=nums[i];
            return max3;}
        }
        return max;
    }
}