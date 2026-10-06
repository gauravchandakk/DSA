class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(')
                s1.push(c);
            else if(c==')' && !s1.isEmpty())
                s1.pop();
            else
                s2.push(')');


        }
        if(s1.isEmpty() && s2.isEmpty()){
            return 0;
        }
        else if(s1.isEmpty()){
            return  s2.size();
        }
        else if(s2.isEmpty()){
            return  s1.size();
        }
        return s1.size()+s2.size();
        
    }
}