class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int min = Integer.MAX_VALUE;
        if (map.containsKey('b') && map.containsKey('a') && map.containsKey('l') && map.containsKey('o')
                && map.containsKey('n')) {

            min = Math.min(map.get('a'), min);
            min = Math.min(map.get('b'), min);
            min = Math.min(map.get('n'), min);
            min = Math.min(map.get('l') / 2, min);
            min = Math.min(map.get('o') / 2, min);
        } else {
            min = 0;
        }
        return min;
    }
}