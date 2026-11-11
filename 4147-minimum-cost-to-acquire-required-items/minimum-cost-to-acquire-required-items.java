class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1==0 && need2==0)
        return 0;
        long cost=0;
        if(need1==0){
            if(cost2>=costBoth){
                cost+=(long)need2*costBoth;
            }
            else{
                cost+=(long)need2*cost2;
            }
            return  cost;
        }
        if(need2==0){
            if(cost1>=costBoth){
                cost+=(long)need1*costBoth;
            }
            else{
                cost+=(long)need1*cost1;
            }
            return  cost;
        }
        if(need1==need2){
            if(cost1+cost2>=costBoth){
                cost+=(long)need1*costBoth;
            }
            else{
                cost+=(long)need1*(cost1+cost2);
            }
            return  cost;
        }
        if(need1>need2){
            if(cost1+cost2>=costBoth){
                cost+=(long)need2*costBoth;
            }
            else{
                cost+=(long)need2*(cost1+cost2);
            }
            need1-=need2;
            need2=0;
            if(cost1>=costBoth){
                cost+=(long)need1*costBoth;
            }
            else{
                cost+=(long)need1*cost1;
            }
            return  cost;
        }
        else{
            if(cost1+cost2>=costBoth){
                cost+=(long)need1*costBoth;
            }
            else{
                cost+=(long)need1*(cost1+cost2);
            }
            need2-=need1;
            need1=0;
            if(cost2>=costBoth){
                cost+=(long)need2*costBoth;
            }
            else{
                cost+=(long)need2*cost2;
            }
            return  cost;
        }
        // while(need1>0 || need2>0){
        //     if((need1>0 && need2>0) && (cost1+cost2>=costBoth)){
        //         cost+=costBoth;
        //         need1--;
        //         need2--;
        //     }
        //     else if((need1>0 && need2>0) && (cost1+cost2<costBoth)){
        //         cost+=cost1+cost2;
        //         need1--;
        //         need2--;
        //     }
        //     else if(need1==0 && cost2>=costBoth){
        //         cost+=costBoth;
        //         need2--;
        //     }
        //     else if(need1==0 && cost2<costBoth){
        //         cost+=cost2;
        //         need2--;
        //     }
        //     else if(need2==0 && cost1>=costBoth){
        //         cost+=costBoth;
        //         need1--;
        //     }
        //     else if(need2==0 && cost1<costBoth){
        //         cost+=cost1;
        //         need1--;
        //     }
        // }
        
    }
}