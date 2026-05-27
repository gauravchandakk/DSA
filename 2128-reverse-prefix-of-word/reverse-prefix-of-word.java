class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        Boolean b=true;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<sb.length();i++){
            s.push(sb.charAt(i));
            if(sb.charAt(i)==ch){
                b=false;
            sb.delete(0,i+1);
                break;
            }
        }
        if(b==true){
            return word;
        }
        int i=0;
        while(!s.empty()){
            char c=s.pop();
            sb.insert(i,c);
            i++;
        }
        return sb.toString();

    }
}