class Solution {
    public int findClosestNumber(int[] nums) {
        int minp=Integer.MAX_VALUE;
        int minn=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                minp=Math.min(nums[i],minp);
            }
            else{
                
                minn=Math.max(nums[i],minn);
            }
        }
        if(Math.min(Math.abs(minn),minp)==minp || minn==Integer.MIN_VALUE)
        return minp;
        return minn;
    }
}