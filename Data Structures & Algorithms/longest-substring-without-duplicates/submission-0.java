class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 ;
        int r = -1 ;
        int ans = 0 ;

        HashMap<Character , Integer> map = new HashMap<>() ;

        while(r < s.length() - 1) {
            r++ ;
            char cRight = s.charAt(r) ;
            map.put(cRight , map.getOrDefault(cRight , 0) + 1) ;

            while(map.get(cRight) > 1) {
                char cLeft = s.charAt(l) ;
                map.put(cLeft , map.get(cLeft) - 1) ;
                if(map.get(cLeft) == 0) {
                    map.remove(cLeft) ;
                }
                l++ ;
            }

            ans = Math.max(ans , r - l + 1) ;
        }
        return ans ;
    }
}
