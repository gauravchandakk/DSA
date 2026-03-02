class Solution {
    public int myAtoi(String s) {
        long output=0L;
        
        int sign=1;
        output=ans(s,0,output,sign,true,true);
        
        

        return (int)output;
    }
    long ans(String s,int i,long output,int sign,boolean si,boolean ws){
        if(i==s.length())
        return sign*output;
       
        
        else if(s.charAt(i)==' ' && ws==true){
            return ans(s,i+1,output,sign,si,ws);
        }
        else if(s.charAt(i)==43 && si==true){
            return ans(s,i+1,output,sign,false,false);
        }
        else if(s.charAt(i)==45 && si==true){
            return ans(s,i+1,output,-1,false,false);
        }
        else if(s.charAt(i)>47 && s.charAt(i)<58){
            
            output=((output*10)+(s.charAt(i)-'0'));
             if (sign == 1 && output > Integer.MAX_VALUE)
    return Integer.MAX_VALUE;

else if (sign == -1 && -output < Integer.MIN_VALUE)
    return Integer.MIN_VALUE;
            return ans(s,i+1,output,sign,false,false);
        }
        
            return sign*output;
        
        

    }
}