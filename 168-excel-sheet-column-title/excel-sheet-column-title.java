class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            if(columnNumber%26==0){
                sb.append('Z');
            columnNumber/=26;
            columnNumber--;

            }
            else{
            sb.append((char)((columnNumber-1)%26+'A'));
            columnNumber/=26;
            }
        }
        sb.reverse();
        return sb.toString();
    }
}