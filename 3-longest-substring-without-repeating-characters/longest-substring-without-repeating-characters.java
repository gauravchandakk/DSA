class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int max=0;
        int left=0;
        String a="";
        for(int i=0;i<s.length();i++){
            if(a.contains(s.charAt(i)+"")){
                left=map.get(s.charAt(i))+1;
                map.put(s.charAt(i),i);
                count=i-left+1;
                a=s.substring(left,i+1);
            }else{
                map.put(s.charAt(i),i);
                a=a+s.charAt(i);
                count++;
            }
            max=Math.max(max,count);
        }
        return  max;
        
    }
}