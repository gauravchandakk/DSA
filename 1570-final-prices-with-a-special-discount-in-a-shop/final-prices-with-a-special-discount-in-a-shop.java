class Solution {
    public int[] finalPrices(int[] prices) {
        int i=0,j=1;
        while(j<prices.length){
            if(j > i && prices[j] <= prices[i]){
                prices[i]-=prices[j];
                i++;
                j=i+1;

            }
            else if(j==prices.length-1){
                i++;
                j=i+1;
            }
            else
            j++;
        }
        return prices;
        
    }
}