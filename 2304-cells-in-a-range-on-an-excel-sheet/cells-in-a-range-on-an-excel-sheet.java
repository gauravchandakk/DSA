class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list=new ArrayList<>();
        String a=s.substring(0,2);
        list.add(a);
        while(!a.equals(s.substring(3,5))){
            if(a.charAt(1)==s.charAt(4)){
                a=""+(char)(a.charAt(0)+1)+s.charAt(1);
            }
            else{
                a=""+a.charAt(0)+(char)(a.charAt(1)+1);

            }
            list.add(a);
        }
        return list;
    }

}