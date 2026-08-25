class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>() ;

        for(char c : t.toCharArray()) {
            map.put(c , map.getOrDefault(c , 0) + 1) ;
        }

        int count = map.size() ;

        int l = 0 ;
        int r = -1 ;
        int ans = Integer.MAX_VALUE ;
        int start = -1 ;

        while(r < s.length() - 1) {
            r++ ;
            char cRight = s.charAt(r) ;
            if(map.containsKey(cRight)) {
                map.put(cRight , map.get(cRight) - 1) ;
                if(map.get(cRight) == 0) {
                    count-- ;
                }
            }
            

            while(count == 0) {
                if(ans > (r - l + 1)) {
                    ans = (r - l + 1) ;
                    start = l ;
                }
                char cLeft = s.charAt(l) ;
                if(map.containsKey(cLeft)) {
                    map.put(cLeft , map.get(cLeft) + 1) ;
                    if(map.get(cLeft) > 0) {
                        count++ ;
                    }
                }
                l++ ;
            }
        }

        return ans == Integer.MAX_VALUE ? "" : s.substring(start , start + ans) ;
    }
}
