class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean b=true;
        for(int i=2;i<n-1;i++){
            String s=Integer.toString(n, i); 
            b=isPalindrome(s);
            if(b==false)
            return false;
        }
        return true;
    }
    String base(int n, int i,String s){
        if(n==0)
        return s;
        
        s=base(n/i,i,s);
        return s+(n%i);


    }
    boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }

}