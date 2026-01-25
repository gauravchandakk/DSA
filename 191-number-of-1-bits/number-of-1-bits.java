class Solution {
    public int hammingWeight(int n) {
        String s=new String();
        int count=0;
        while(n>0){
            s+=(n%2);
            if(n%2==1)
            count++;
            n/=2;
        }
        return count;

        
        
    }
}