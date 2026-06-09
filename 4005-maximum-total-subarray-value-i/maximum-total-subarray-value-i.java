class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long  min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        long l=(max-min)*k;
        return l;
    }
}