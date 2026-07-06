class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
    if (a[0] != b[0]) {
        return Integer.compare(a[0], b[0]);
    }
    return Integer.compare(b[1], a[1]);
});
        int  j=0;
        int count=0;
        for(int i=0;i<intervals.length;i++){
            if(i!=j && intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1] ){
                continue;
            }
            else{
                count++;
                j=i;
            }
        }
        return count;
    }
}