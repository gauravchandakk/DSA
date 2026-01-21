class Solution {
    public int pivotInteger(int n) {
        int i=0,j=n;
        int sum=i;
        int bsum=j;
        while(i<j){
            if(sum<=bsum){
                i++;
                sum+=i;
            }
            else{
                j--;
                bsum+=j;
            }
        }
        if(sum==bsum){
            return i;
        }
        return -1;
    }
}