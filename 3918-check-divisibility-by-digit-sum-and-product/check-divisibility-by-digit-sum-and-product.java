class Solution {
    public boolean checkDivisibility(int n) {
        return (n%(sum(n,0)+pro(n,1))==0);
    }
    int  sum(int n,int sum){
        if(n==0)
        return sum;
        sum=sum(n/10,sum);
        sum+=n%10;
        return sum;

    }
    int pro(int n,int pro){
        if(n<=1)
        return pro;
        pro=pro(n/10,pro);
        pro*=n%10;
        return pro;

    }
}