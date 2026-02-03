class Solution {
    public boolean isTrionic(int[] nums) {
        int z=0;
        int i=1;
        while(i<nums.length && nums[i]>nums[i-1]){
            i++;
            z=1;
        }
        
        if(z!=1)
        return false;
        while(i<nums.length &&nums[i]<nums[i-1]){
            z=2;
            i++;
        }
        if(z!=2)
            return false;
      
        while(i<nums.length && nums[i]>nums[i-1]){
            
            
            
            i++;
            z=3;
        }
        if(z==3 && i==nums.length)
        return true;
        return false;
    }
}