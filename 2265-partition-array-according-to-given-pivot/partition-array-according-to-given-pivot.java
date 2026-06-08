class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int n:nums){
            if(n<pivot)
            l1.add(n);
            else if(n>pivot)
            l2.add(n);
        }
        int i=0;

        int s=l1.size();
        while(i<s ){
            nums[i]=l1.get(i);
            i++;  
        }
        s=l2.size();
        while(i<nums.length-s){
            nums[i]=pivot;
            i++; 
        }
        s=0;
        while(i<nums.length){
            nums[i]=l2.get(s);
            i++; 
            s++;
        }
        return nums;
    }
}