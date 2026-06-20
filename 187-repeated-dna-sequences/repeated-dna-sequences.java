class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        if(s.length()<=10){
            
            return list;
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length()-9;i++){
            if(map.containsKey(s.substring(i,i+10))){
                map.put(s.substring(i,i+10),map.get(s.substring(i,i+10))+1);
            }
            else{
                map.put(s.substring(i,i+10),1);

            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}