class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<String> st=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                
                st.add(sb.toString());
                int j = sb.indexOf(String.valueOf(s.charAt(i)));
                sb.delete(0,j+1);
                sb.append(s.charAt(i));
            
            }
            else{
                sb.append(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        st.add(sb.toString());
        int max=0;
        for(String i : st){
            max=Math.max(max,i.length());
        }
        return max;
    }
}