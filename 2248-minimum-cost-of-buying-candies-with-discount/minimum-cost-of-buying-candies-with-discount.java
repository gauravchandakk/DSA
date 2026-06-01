class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int  i=cost.length-1;
        while(i>=0){
            if(i==0){
                sum+=cost[i];
                i--;
            }else if(i==1){
                sum+=cost[i]+cost[i-1];
                i-=2;
            }
            else{
                sum+=cost[i]+cost[i-1];
                i-=3;
            }
        }
        return sum;
    }
}