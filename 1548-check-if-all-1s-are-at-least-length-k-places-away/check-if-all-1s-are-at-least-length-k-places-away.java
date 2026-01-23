class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int x=k;
        int i=0;
        boolean z=false;
       
        while(i<nums.length){
            if(z==false && nums[i]==1){
                x=0;
                z=true;
            }
            else if(nums[i]==1 && x>=k){
                x=0;
                
            }
            else if(nums[i]==0 & x<=k){
                x++;
            }
            else if(nums[i]==1 && x<k){
                return false;
            }
            
            i++;
        }
        return true;
    }
}