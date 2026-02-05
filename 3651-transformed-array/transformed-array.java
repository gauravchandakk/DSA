class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int a=i;
            if(nums[i]>0){
                a=nums[i]%n;
                ans[i]=nums[(i+a)%n];
            }
            else if(nums[i]<0){

                a=(Math.abs(nums[i]))%n;
                int b=i-a;
                if(b<0)
                b+=n;
                ans[i]=nums[b%n];
            }
            else{
                ans[i]=nums[a];
            }
        }
        return ans;
    }
}