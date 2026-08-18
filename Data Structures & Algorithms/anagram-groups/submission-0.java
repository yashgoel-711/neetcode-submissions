class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>() ;
        for(String s : strs) {
            
            char[] charsArray = s.toCharArray() ;
            Arrays.sort(charsArray) ;
            String sorted = new String(charsArray) ;
            map.putIfAbsent(sorted , new ArrayList<>()) ;
            map.get(sorted).add(s) ;
        }
        return new ArrayList<>(map.values()) ;       
    }
}
