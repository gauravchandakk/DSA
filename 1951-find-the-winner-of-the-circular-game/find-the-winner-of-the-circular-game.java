class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1)
        return 1;
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        return  ans(q,k);
        
    }
    public int ans(Queue<Integer> q,int k){
        
        

        int i=1;
        while(i<=k){
            if(i==k){
                q.poll();
            }
            else{
                int t=q.poll();
                q.offer(t);
            }
            i++;

        }
        if(q.size()==1)
        return q.poll();
        return ans(q,k);
    }
}