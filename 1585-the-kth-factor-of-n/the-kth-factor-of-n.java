class Solution {
    public int kthFactor(int n, int k) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                if(count==k)
                return i;
            }
            if(i>=n/2 && i!=n){
                i=n-1;
            }
            
        }
        return -1;
    }
}