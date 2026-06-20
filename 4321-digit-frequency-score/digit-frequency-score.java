class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int a=n%10;
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
            n/=10;
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            n+=(entry.getKey()*entry.getValue());
        }
        return n;
    }
}