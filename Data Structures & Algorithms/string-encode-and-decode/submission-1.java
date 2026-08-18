class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder() ;
        for(String s : strs) {
            encoded.append(s.length() + "_" + s) ;
        }
        return encoded.toString() ;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0 ;
        while(i < str.length()) {
            StringBuilder l = new StringBuilder() ;
            int j = i ;
            while(str.charAt(j) != '_') {
                l.append(str.charAt(j)) ;
                j++;
            }
            int len = Integer.parseInt(l.toString());
            ans.add(str.substring(j + 1 , j + 1 + len)) ;
            i = len + j + 1 ;
        }
        return ans ;
    }
}
