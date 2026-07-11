class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            list.add(i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        int i=0;
        while(list.size()!=map.size()){
            if(list.size()<3)
            return count+1;
            list.remove(0);
            list.remove(0);
            list.remove(0);
            if(map.get(nums[i])==1)
            map.remove(nums[i]);
            else
            map.put(nums[i],map.get(nums[i])-1);
            i++;
            if(map.get(nums[i])==1)
            map.remove(nums[i]);
            else
            map.put(nums[i],map.get(nums[i])-1);
            i++;
            if(map.get(nums[i])==1)
            map.remove(nums[i]);
            else
            map.put(nums[i],map.get(nums[i])-1);
            i++;
            count++;
        }
        return  count;
    }
}