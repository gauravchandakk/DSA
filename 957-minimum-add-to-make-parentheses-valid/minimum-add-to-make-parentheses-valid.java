class Solution {
    public int minAddToMakeValid(String s) {
        int a=0;
        int b=0;
        for(char c:s.toCharArray()){
            if(c=='(')
                a++;
            else if(c==')' && a!=0)
                a--;
            else
                b++;


        }
        if(a==0 && b==0){
            return 0;
        }
        else if(a==0){
            return  b;
        }
        else if(b==0){
            return  a;
        }
        return a+b;
        
    }
}