class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        int play=0;
        int max=0;
        while(i<=j){
            if(i==j && play==0 &&  tokens[i]>power){
                return max;
            }
            if( play==0 &&  tokens[i]>power){
                return max;
            }
            else if(tokens[i]<=power){
                power-=tokens[i];
                i++;
                play++;
                max=Math.max(max,play);
            }
            else if(tokens[i]>power){
                power+=tokens[j];
                j--;
                play--;

            }
        }
        return max;

    }
}