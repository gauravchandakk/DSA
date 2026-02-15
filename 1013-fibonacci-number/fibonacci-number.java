class Solution {
    public int fib(int n) {
        int sum=0;
        sum=fab(sum,n);
        return sum;
        
    }
    int fab(int sum,int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        sum=fab(sum,n-1)+fab(sum,n-2);
        return sum;
    }
}