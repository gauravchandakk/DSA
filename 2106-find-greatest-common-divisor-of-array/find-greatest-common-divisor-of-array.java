class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gcd=1;
        int n=nums.length-1;
        for(int i=gcd+1;i<=nums[0];i++){
            if(nums[0]%i==0 && nums[n]%i==0)
            gcd=i;
        }
        return gcd;
    }
}