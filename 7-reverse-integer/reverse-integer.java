class Solution {
    public int reverse(int x) {
        int a=1;
        if(x<0){
            a=-1;
            x=-1*x;
        }
        long ans=0;
        while(x>0){
            ans=(ans*10)+(x%10);
            x/=10;
        }
        if(a*ans<-2147483648  || a*ans>2147483647)
        return 0;
        return a*(int)ans;
    }
}