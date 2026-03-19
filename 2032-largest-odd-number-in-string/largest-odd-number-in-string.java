class Solution {
    public String largestOddNumber(String num) {
        int  n=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(((int)num.charAt(i))%2!=0){
                n=i;
                break;
            }
            
        }
        StringBuilder a =new StringBuilder();
        for(int i=0;i<=n;i++){
            a.append(num.charAt(i));
        }
        return  a.toString();
    }
}