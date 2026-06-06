class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] lSum = new int[n];
        int[] rSum = new int[n];
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (i == 0) {
                rSum[i] = 0;
                lSum[j] = 0;
                
            } 
             else {
                rSum[i] = rSum[i - 1] + nums[i-1];
                lSum[j] = lSum[j + 1] + nums[j+1];
            }
        }
        for (int i = 0; i < n; i++) {
            lSum[i] = Math.abs(rSum[i] - lSum[i]);
        }
        return lSum;
    }
}