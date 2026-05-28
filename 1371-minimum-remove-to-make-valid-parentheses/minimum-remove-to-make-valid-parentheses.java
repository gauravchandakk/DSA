class Solution {
    public String minRemoveToMakeValid(String s) {
        
        int  count=0;
        Deque<Character> st = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && count==0){
                continue;
            }
            else if(s.charAt(i)=='('){
                st.push('(');
                count++;
            }
            else if(s.charAt(i)==')'){
                st.push(')');
                count--;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            if(count>0 && st.peek()=='('){
                st.pop();
                count--;
            }
            else{
                sb.append(st.pop());
            }
        }
        return sb.reverse().toString();
    }
}