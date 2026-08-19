class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder() ;
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c)) ;
            }
        }
        String org = new String(str.toString()) ;
        return org.equals(str.reverse().toString()) ;
    }
}
