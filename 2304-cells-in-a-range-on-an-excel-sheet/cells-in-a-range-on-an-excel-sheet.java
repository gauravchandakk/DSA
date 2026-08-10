class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list=new ArrayList<>();
        StringBuilder a=new StringBuilder(s.substring(0,2));
        list.add(a.toString());
        while(!a.toString().equals(s.substring(3,5))){
            
            if(a.charAt(1)==s.charAt(4)){
                a.setCharAt(0,(char)(a.charAt(0)+1));
                a.setCharAt(1,s.charAt(1));
            }
            else{
                
                a.setCharAt(1,(char)(a.charAt(1)+1));

            }
            list.add(a.toString());
        }
        return list;
    }

}