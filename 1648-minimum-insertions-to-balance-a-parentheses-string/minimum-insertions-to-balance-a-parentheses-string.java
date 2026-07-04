class Solution {
    public int minInsertions(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ){
                st.push('(');
                
            }
            
                else if(i+1<s.length()&& s.charAt(i)==')' && s.charAt(i+1)==')' && st.isEmpty()){
                    count+=1;
                    i+=1;
                }
                else if(i+1<s.length()&& s.charAt(i)==')'&& s.charAt(i+1)==')'){
                    st.pop();
                    i+=1;
                }
                
            
            else if( st.isEmpty() &&s.charAt(i)==')'){
                count+=2;
            }
            else{
                st.pop();
                count++;
            }
        }
        if(st.isEmpty())
        return count;
        else 
        return  count+(2*st.size());    
    }
}