class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character , Integer> map = new HashMap<>() ;
        for(char c : s1.toCharArray()) {
            map.put(c , map.getOrDefault(c , 0) + 1) ;
        }

        int l = 0 ;
        int r = -1 ;

        while(r < s2.length() - 1) {
            r++ ;
            char cRight = s2.charAt(r) ;

            if(!map.containsKey(cRight)) {
                while(l <= r) {
                    char cLeft = s2.charAt(l) ;
                    if(map.containsKey(cLeft)) {
                        map.put(cLeft , map.get(cLeft) + 1) ;
                    }
                    l++;
                }
            } else {
                map.put(cRight , map.get(cRight) - 1) ;
                while(map.get(cRight) < 0) {
                    char cLeft = s2.charAt(l) ;
                    map.put(cLeft , map.get(cLeft) + 1) ;
                    l++;
                }
            }

            if((r - l + 1) == s1.length()) {
                return true ;
            }            
        }
        return false;
    }
}
