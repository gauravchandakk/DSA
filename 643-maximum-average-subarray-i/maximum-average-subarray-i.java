class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // double maxAverage=-10001;
        int left=0;
        int right=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxAverage=(double)sum/k;
        while(right<nums.length){
            maxAverage=Math.max(maxAverage,(double)sum/k);
            sum-=nums[left];
            left++;
            right++;
            if(right!=nums.length)
            sum+=nums[right];
        }
        return maxAverage;
        
    }
}