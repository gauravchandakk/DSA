class Solution {
    public int tribonacci(int n) {
        if(n==0)
        return  0;
        if(n==1 || n==2)
        return 1;
        int t=0;
        int s=1;
        int f=1;
        for(int i=3;i<=n;i++){
            int c=f+s+t;
            t=s;
            s=f;
            f=c;
        }
        return f;
    }
}