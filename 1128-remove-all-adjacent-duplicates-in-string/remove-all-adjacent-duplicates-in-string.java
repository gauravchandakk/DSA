class Solution {
    public String removeDuplicates(String a) {
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder(a);
        
        for(int i =0;i<sb.length();i++){
            if(s.empty()){
                s.push(sb.charAt(i));
            }
            else if(sb.charAt(i)==s.peek()){
                
                s.pop();
            }
            else{
                s.push(sb.charAt(i));
            }
        }
       
        StringBuilder s1=new StringBuilder();
        while(!s.empty()){
            s1.insert(0,s.pop());
            
        }
        return s1.toString();
    }
}