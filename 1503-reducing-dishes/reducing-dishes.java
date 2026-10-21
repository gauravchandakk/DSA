class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int max=0;
        for(int i=0;i<satisfaction.length;i++){
            max=Math.max(max,ans(i,satisfaction));
            if(satisfaction[i]>=0){
                return max;
            }
        }
        return max;
    }
    public int ans(int i,int[] satisfaction){
        int pro=0;
        int j=1;
        for(int k=i;k<satisfaction.length;k++,j++){
            pro+=satisfaction[k]*j;
        }
        return pro;
    }
}