class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }  
        PriorityQueue<Integer> pq = new PriorityQueue<>();

for (int freq : map.values()) {
    pq.offer(freq);
}
while (k > 0) {
    int freq = pq.poll();

    if (k >= freq) {
        k -= freq;      
    } else {
        pq.offer(freq); 
        break;
    }
}
return pq.size();
    }
}
    