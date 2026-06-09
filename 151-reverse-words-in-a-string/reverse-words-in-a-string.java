class Solution {
    public String reverseWords(String s) {
        if(s.length()==1)
        return s;
        int i=s.length()-2,j=s.length()-1;
        String ans="";
        while(i>=0){
            if(s.charAt(i)==' ' && s.charAt(j)==' '){
                i--;
                j--;
            }
            else if(s.charAt(i)!=' ' && s.charAt(j)==' '){
                
                j--;
            }
            else if(s.charAt(i)==' '){
                ans+=s.substring(i+1,j+1);
                ans+=' ';
                j=i;
                i=j-1;
            }
            else if(i==0){
                 ans+=s.substring(i,j+1);
                 i--;
            }
            else{
                i--;
            }
        }
        if(ans.charAt(ans.length()-1)==' ')
        return ans.substring(0,ans.length()-1);
        return ans;
    }
}