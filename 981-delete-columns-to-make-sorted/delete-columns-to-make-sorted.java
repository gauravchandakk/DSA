class Solution {
    public int minDeletionSize(String[] strs) {
        int i=0;
        int output=0;
        for(int j=0;j<strs[0].length();j++){
            i=0;
          while(i<strs.length-1){
            if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                output++;
                i++;
                break;
            }
            else{
                i++;
            }
            
          }
        }
        return output;
    }
}