class Solution {
    public int minimumRounds(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        for(int i=0;i<nums.length;i++){
            
                 if(map.get(nums[i])>0 && map.get(nums[i])%3==0){
                    count++;
                    map.put(nums[i],map.get(nums[i])-3);
                }
                else if(map.get(nums[i])>0 &&  map.get(nums[i])%2==0){
                    count++;
                   map.put(nums[i],map.get(nums[i])-2);
                }
                else if(map.get(nums[i])>1){
                    count++;
                    map.put(nums[i],map.get(nums[i])-3);
                }
                else if(map.get(nums[i])==1)
                return -1;
            
        }
        return count;

        

    }
}