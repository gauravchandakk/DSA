class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int a=(int)s.charAt(i)-'a';
            a=26-a;
            ans+=(i+1)*a;

        }
        return ans;
    }
}