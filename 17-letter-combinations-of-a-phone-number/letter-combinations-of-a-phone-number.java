class Solution {
    public List<String> letterCombinations(String digits) {
        return combinations(digits,"");
        
    }
    public List<String> combinations(String digits,String p) {
        List<String> list=new ArrayList<>();
        if(digits.isEmpty()){
            list.add(p);
            return list;
        }
        int digit=digits.charAt(0)-'0';
        if(digit==7){
            for(int i=(digit-2)*3;i<((digit-1)*3)+1;i++){
                char ch=(char)('a'+i);
                list.addAll(combinations(digits.substring(1),p+ch));
            }
        }
        else if(digit==9){
            for(int i=(digit-2)*3+1;i<(digit-1)*3+2;i++){
                char ch=(char)('a'+i);
                list.addAll(combinations(digits.substring(1),p+ch));
            }
        }
        else if(digit==8){
            for(int i=(digit-2)*3+1;i<(digit-1)*3+1;i++){
                char ch=(char)('a'+i);
                list.addAll(combinations(digits.substring(1),p+ch));
            }
        }
        else{
            for(int i=(digit-2)*3;i<(digit-1)*3;i++){
                char ch=(char)('a'+i);
                list.addAll(combinations(digits.substring(1),p+ch));
            }
        }
        return list;
    }
}