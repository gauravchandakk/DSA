class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(total<cost1 && total<cost2)
        return 1;
        long count =0;
       
        for(int i=0;i<=total/cost1;i++){
            int t=total;
            t-=cost1*i;
            int a=t/cost2;
            count+=(a+1);

        }
        
        return count;
    }
}