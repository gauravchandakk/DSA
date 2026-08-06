class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+10;i++){
            if(product(i,t,1))
            return i;
        }
        return -1;
    }
    boolean product(int n,int t,int p){
        while(n>0){
            p*=n%10;
            n/=10;
            if(p==0)
            return true;
        }
        if(p%t==0)
        return true;
        return false;
        
    }
}