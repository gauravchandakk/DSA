class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int first=cost[1];
        int second=cost[0];
        for(int i=2;i<n;i++){
            int curr=cost[i]+Math.min(first,second);
            second=first;
            first=curr;
        }
        return Math.min(first,second);
    }
}