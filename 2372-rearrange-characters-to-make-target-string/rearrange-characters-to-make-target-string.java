class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }
         int min = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char c=entry.getKey();
            if(map2.containsKey(c) && map2.get(c)>=entry.getValue()){
                min=Math.min(min,map2.get(c)/entry.getValue());
                
            }
            else {
                return 0;
            }
        }
        if(min== Integer.MAX_VALUE)
        return 0;
        else 
        return min;
       
        
    }
}