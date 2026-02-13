class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long cost=0;
        if(m<=k && n<=k)
        return 0;
        else if(m<=k && n>k){
            cost=(long)(n-k)*k;
            return cost;
        }
        else if(n<=k && m>k){
            cost=(long)(m-k)*k;
            return cost;
        }
        else{
            return 0;
        }
    }
}