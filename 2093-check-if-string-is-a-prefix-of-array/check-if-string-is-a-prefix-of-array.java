class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String ans="";
        for(String i: words){
            ans=ans+i;
            if(ans.equals(s))
            return  true;
            if(ans.length()>s.length())
            return false;
        }
        return false;
    }
}