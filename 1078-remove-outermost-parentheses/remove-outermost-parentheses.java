class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String a="";
       for(int i =0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            count++;
            if(count>1)
            a=a+ch;
        }
        else if(ch==')'){
            count--;
            if(count>0)
            a=a+ch;
        }
        
       } 
       return a;
    }
}