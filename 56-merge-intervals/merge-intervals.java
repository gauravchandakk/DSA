class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int i=0;
        for(int j=1;j<intervals.length;j++){
            if(intervals[i][1]>=intervals[j][0]){
                intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
            }
            else{
                ans.add(intervals[i]);
                i=j;
            }
        }
        ans.add(intervals[i]);
       return ans.toArray(new int[ans.size()][]);
    }
}