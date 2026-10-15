class Solution {
    public int firstUniqChar(String s) {
        // yal
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            if (map.get(c) == 1){
                return j;
            }
        }

        return -1;
    }
}