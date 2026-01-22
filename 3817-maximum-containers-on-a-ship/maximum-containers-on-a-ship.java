class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cells=n*n;
        int total=cells*w;
        if(total<maxWeight)
        return cells;
        return maxWeight/w;
        
    }
}