class Solution {
    public int primePalindrome(int n) {
        boolean a=false;
        while(n<=200000000){
            if (10000000 < n && n < 100000000)
        n = 100000000;

           
            if(isPallindrome(n) && isPrime(n)){
                 return n;
            }
          
            n++;
        }
        return -1;
    }

        
    
    public static boolean isPrime(int n) {
    if (n <= 1)
        return false;
    if (n == 2)
        return true;
    if (n % 2 == 0)
        return false;

    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0)
            return false;
    }

    return true;
}
   public  static boolean isPallindrome(int n){
     String s=String.valueOf(n);
     int i=0;
     int j=s.length()-1;
     while(i<=j){
        if(s.charAt(i)!=s.charAt(j))
        return false;
        else {
            i++;
            j--;
        }
     }
     return true;
   }
}