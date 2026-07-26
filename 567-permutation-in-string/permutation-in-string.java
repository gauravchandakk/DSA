class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left=0;
        int right=s1.length()-1;
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=left;i<=right;i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        while(right<s2.length()-1){
            if(map2.equals(map))
            return true;
            else if(map2.get(s2.charAt(left))==1){
                map2.remove(s2.charAt(left));
                left++;
            }
            else{
                map2.put(s2.charAt(left),map2.get(s2.charAt(left))-1);
                left++;
            }
            right++;
            map2.put(s2.charAt(right),map2.getOrDefault(s2.charAt(right),0)+1);
        }
        if(map2.equals(map))
            return true;
        return false;
    }
}