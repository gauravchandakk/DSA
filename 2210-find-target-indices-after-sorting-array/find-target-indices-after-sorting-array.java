class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessThanTargetCount=0;
        int targetCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                lessThanTargetCount++;
            }
            else if(nums[i]==target){
                targetCount++;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<targetCount;i++){
            
            list.add(lessThanTargetCount+i);
        }
        return list;
        
    }
}