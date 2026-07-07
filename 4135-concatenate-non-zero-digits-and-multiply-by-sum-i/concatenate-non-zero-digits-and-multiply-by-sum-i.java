class Solution {
    public long sumAndMultiply(int n) {
        Stack<Integer> s=new Stack<>();
        int sum=0;
       while(n>0){
        if(n%10!=0){
            s.push(n%10);
            sum+=n%10;
        }
            n/=10;
        
       }
       long ans=0;
       while(!s.isEmpty()){
        ans*=10;
        ans+=s.pop();
       }
       return ans*sum;
    }
}