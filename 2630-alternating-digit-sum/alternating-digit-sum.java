class Solution {
    public int alternateDigitSum(int n) {
        int count=0;
        count=digitCount(n,count);
        int ans=0;
        if(count%2==0){
           ans=out(n,ans,1);
        }
        else{
            ans=out(n,ans,-1);
        }
        return ans;
    }
    int digitCount(int n,int count){
        if(n==0)
        return count;
        count++;
        count=digitCount(n/10,count);
        return count;

    }
    int out(int n,int ans,int mul){
        if(n==0)
        return ans;
        ans+=-1*mul*(n%10);
        ans=out(n/10,ans,mul*-1);
        return ans;
        

    }
}