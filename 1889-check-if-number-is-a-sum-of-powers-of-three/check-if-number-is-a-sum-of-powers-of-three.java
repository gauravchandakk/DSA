class Solution {
    public boolean checkPowersOfThree(int n) {
        int i=16;
        int a=0;
        while(i>=0){
            a=(int)Math.pow(3,i);
            if(n-a>=0){
                n-=a;
            }
            i--;
        }
        if(n==0)
        return true;
        return false;
        
    }
}