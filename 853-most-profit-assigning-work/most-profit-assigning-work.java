class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<difficulty.length;i++){
            if(map.containsKey(difficulty[i]))
            map.put(difficulty[i],Math.max(map.get(difficulty[i]),profit[i]));
            else
            map.put(difficulty[i],profit[i]);
        }
        int ans=0;
        Arrays.sort(difficulty);
        Arrays.sort(worker);
        int i=0;
        int j=0;
        int max=0;
        while(i<worker.length && j<difficulty.length){
            if(j<difficulty.length-1 && worker[i]>=difficulty[j+1]){
                max=Math.max(max,map.get(difficulty[j]));
                j++;
            }
            else if(j<difficulty.length-1 && worker[i]<difficulty[j+1] && worker[i]>=difficulty[j]){
                i++;
                max=Math.max(max,map.get(difficulty[j]));
                ans+=max;
            }
            else if(worker[i]>=difficulty[j]){
                i++;
                max=Math.max(max,map.get(difficulty[j]));
                ans+=max;
            }
            else if(worker[i]<difficulty[j]){
                max=Math.max(max,map.get(difficulty[j]));
                i++;
            }
        }
        return ans;
    }
}