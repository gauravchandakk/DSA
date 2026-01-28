class Solution {
    public int countPartitions(int[] nums) {
        int sum=0,count=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int lsum=0;
        int rsum=sum;
        for(int j=nums.length-1;j>0;j--){
            lsum+=nums[j];
            rsum-=nums[j];
            if((lsum-rsum)%2==0)
            count++;
        }
        return count;
        
    }
}