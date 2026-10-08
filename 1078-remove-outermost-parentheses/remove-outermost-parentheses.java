class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }
            else if(st.size()==1 && c==')'){
                st.pop();
            }
            else if(c=='('){
                st.push(c);
                sb.append(c);
            }
            else{
                st.pop();
                sb.append(c);
            }
        }
        return sb.toString();
    }
}