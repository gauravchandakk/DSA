class Solution {
    public int integerBreak(int n) {
        int sum=0;
        int pro=1;
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        while(sum!=n){
            if(n-sum==4){
                sum+=4;
                pro*=4;
            }
            else if(n-sum==2){
                sum+=2;
                pro*=2;
            }
            else if(n-sum==1){
                sum+=1;
                pro*=1;
            }
            else{
                sum+=3;
                pro*=3;
            }
        }
        return pro;
    }
}