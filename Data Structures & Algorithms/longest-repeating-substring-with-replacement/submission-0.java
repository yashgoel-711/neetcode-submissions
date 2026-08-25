class Solution {
    public int findMaxFreq(HashMap<Character , Integer> map) {
        int maxFreq = 0 ;
        for(Integer f : map.values()) {
            maxFreq = Math.max(maxFreq , f) ;
        }
        return maxFreq ;
    }
    public int characterReplacement(String s, int k) {
        int l = 0 ;
        int r = -1 ;
        int ans = 0 ;

        HashMap<Character , Integer> map = new HashMap<>() ;
        int maxFreq = 0 ;

        while(r < s.length() - 1) {
            r++;
            char cRight = s.charAt(r) ;
            map.put(cRight , map.getOrDefault(cRight , 0) + 1) ;
            maxFreq = Math.max(maxFreq , map.get(cRight)) ;

            while(((r - l + 1) - maxFreq) > k) {
                char cLeft = s.charAt(l) ;
                map.put(cLeft , map.get(cLeft) - 1) ;
                maxFreq = findMaxFreq(map) ;
                l++ ;
            }

            ans = Math.max(ans , r - l + 1) ;
        }
        return ans ;
    }
}
