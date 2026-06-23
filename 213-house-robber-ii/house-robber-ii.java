class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1)
        return nums[0];
                int first=0;
        int second=0;
        boolean b=true;
        for(int i=1;i<nums.length;i++){
           if(first+nums[i]>=second+nums[i] && b==true){
            second=first;
            first+=nums[i];
            b=false;
           }
           else if(first<second+nums[i] && b==false){
            int temp=second;
            second=first;
            first=temp+nums[i];
            b=false;
           }
           else{
            second+=nums[i];
            
            b=true;
           }
        }
        int a=first;
        first=0;
        second=0;
        b=true;
        for(int i=0;i<nums.length-1;i++){
           if(first+nums[i]>=second+nums[i] && b==true){
            second=first;
            first+=nums[i];
            b=false;
           }
           else if(first<second+nums[i] && b==false){
            int temp=second;
            second=first;
            first=temp+nums[i];
            b=false;
           }
           else{
            second+=nums[i];
            
            b=true;
           }
        }
        return Math.max(a,first);
    }
}