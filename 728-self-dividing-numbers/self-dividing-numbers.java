class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> arr = new ArrayList<>();

        for(int i=left;i<=right;i++){
            int b=i;
            Boolean a=true;
            while(b>0){
               int x=(b%10);
                if(x==0 || i%x!=0){
                    a=false;
                    break;
                }
                
                b/=10;
            }
            if(a==true){
                arr.add(i);
            }
        }
        return arr;
        
    }
}