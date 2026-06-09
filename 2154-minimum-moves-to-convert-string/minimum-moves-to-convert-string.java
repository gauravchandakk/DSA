class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int  count=0;
        while(i<s.length()){
            if(s.charAt(i)=='O')
            i++;
            else if(s.charAt(i)=='X'){

            count++;
            i=i+3;
            }
        }
        return count;
    }
}