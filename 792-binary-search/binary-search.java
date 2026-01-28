class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        return bsearch(nums,start,end,target);

        
    }
    int bsearch(int[] nums,int start,int end, int target){
        int mid=(start+end)/2;
        
        if(start>end)
        return -1;
        else if(nums[mid]<target)
        return bsearch(nums,mid+1,end,target);
        else if(nums[mid]>target)
        return bsearch(nums,start,mid-1,target);
        else
        return mid;
        
    }
}