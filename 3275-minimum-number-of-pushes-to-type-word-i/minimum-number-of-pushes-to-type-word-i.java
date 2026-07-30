class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8)
        return n;
        else if(n>8 && n<16)
        return n+n%8;
        else if(n==16)
        return 24;
        else if(n>16 && n<24)
        return 24+(n%8)*3;
        else if(n==24)
        return 48;
        else return  48+(n%8)*4;
    }
}