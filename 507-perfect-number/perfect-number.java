class Solution {
    public boolean checkPerfectNumber(int num) {
       
        int sum=0;
        for(int i=1,j=num/2;i<=j;i++,j--){
            if(i==j && num%i==0){
                sum+=i;
                break;
            }
            if(num%i==0)
            sum+=i;
            if(num%j==0)
            sum+=j;
        }
        
        if(sum==num)
        return true;
        return false;
    }
}