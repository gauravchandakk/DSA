class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int value =tickets[k];
        int time=0;
        for(int i=0;i<tickets.length;i++){
            if(value>tickets[i])
            time+=tickets[i];
            else if(i<=k && value<=tickets[i])
            time+=value;
            else if(i>k && value<=tickets[i]){
                time+=(value-1);
            }
        }
        return time;
        
    }
}