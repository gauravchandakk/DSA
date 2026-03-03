class Solution {
    public int searchInsert(int[] nums, int target) {
        
     int ans= bSearch(nums,0,nums.length-1,target);
     return ans; 
    }
    int bSearch(int[] nums,int start,int end,int target){
        int mid=(start+end)/2;
        if(start>=end){
            if(nums[mid]<target)
            return mid+1;
            else
            return mid;
        }
        
        if(nums[mid]==target )
        return mid;
        else if(nums[mid]>target)
        return bSearch(nums,start,mid-1,target);
        else if(nums[mid]<target)
        return bSearch(nums,mid+1,end,target);
        return mid;
    }
}