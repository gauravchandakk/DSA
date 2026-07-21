class Solution {
    public int smallestEqual(int[] nums) {
        int min=101;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                min=Math.min(min,i);
            }
        }
        if(min==101)
        return -1;
        return min;
    }
}