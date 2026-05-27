class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> s = new ArrayList<>();
        int j=0;
        for(int i=1;i<=n && j<target.length;i++){
            
            s.add("Push");
            if(target[j]!=i){
            s.add("Pop");
            
            }
            else
            j++;
        }
        return s;
    }
}