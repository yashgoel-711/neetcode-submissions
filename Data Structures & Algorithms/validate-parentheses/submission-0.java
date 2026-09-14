class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>() ;
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stk.push(c) ;
            } else {
                if(stk.size() == 0) return false ;

                Character sc = stk.peek() ;
                if( (c == ')' && sc == '(') ||
                    (c == ']' && sc == '[') ||
                    (c == '}' && sc == '{') ) {

                    stk.pop() ;
                } else {
                    return false ;
                }
            }
        }

        return stk.size() == 0 ;
    }
}
