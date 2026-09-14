class Solution {
    public Integer calc(Stack<Integer> stk , String c) {
        Integer b = stk.pop()  ;
        Integer a = stk.pop()  ;
        
        switch(c) {
            case "+" : return b + a ;
            case "-" : return a - b ;
            case "/" : return a / b ;
            case "*" : return b * a ;
        }
        return -1 ;

    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack() ;

        for(String c : tokens) {
            if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")) {
                stk.push(calc(stk , c)) ;
            } else {
                stk.push(Integer.valueOf(c)) ;
            }
        }
        return stk.pop() ;
    }
}
