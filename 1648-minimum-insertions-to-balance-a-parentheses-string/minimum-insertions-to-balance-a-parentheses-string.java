class Solution {
    public int minInsertions(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        char[] arr=s.toCharArray();
        int j=arr.length;
        for(int i=0;i<j;i++){
            if(arr[i]=='(' ){
                st.push('(');
                
            }
            
                else if(i+1<j&& arr[i]==')' && arr[i+1]==')' && st.isEmpty()){
                    count+=1;
                    i+=1;
                }
                else if(i+1<j&& arr[i]==')'&& arr[i+1]==')'){
                    st.pop();
                    i+=1;
                }
                
            
            else if( st.isEmpty() &&arr[i]==')'){
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