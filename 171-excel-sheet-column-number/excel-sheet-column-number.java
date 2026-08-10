class Solution {
    public int titleToNumber(String columnTitle) {
        int t=0;
        for(char c:columnTitle.toCharArray()){
            t*=26;
            t+=(c-'A'+1);
        }
        return t;
    }
}