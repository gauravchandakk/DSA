class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        boolean b=true;
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i>=strs[j].length()){
                    b=false;
                    break;
                }
                if(strs[j].charAt(i)!=c){
                    b=false;
                    break;
                }
            }
            if(b==false)
            break;
            sb.append(c);
        }
        return sb.toString();
    }
}