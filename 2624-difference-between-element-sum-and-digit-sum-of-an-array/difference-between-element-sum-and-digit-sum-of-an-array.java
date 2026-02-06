class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            esum+=nums[i];
            int a=0;
            dsum+=fdsum(nums[i],a);
        }
        return Math.abs(dsum-esum);
        
    }
    int fdsum(int nums,int dsum){
        if(nums==0)
        return dsum;
        dsum+=nums%10;
        return fdsum(nums/10,dsum);

    }
}