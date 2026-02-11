class Solution {
    public int addDigits(int num) {
        int out=0;
        return ans(num,out);
        
    }
    int ans(int num,int out){
      
        if(num<10)
        return num;
        
        else{
            while(num>0){
                out+=num%10;
                num/=10;
            }
            out=ans(out,0);
            return out;
        }
    }
}