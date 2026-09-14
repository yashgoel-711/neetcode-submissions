class MinStack {
    Stack<Integer> stk ;
    Stack<Integer> minStk ;

    public MinStack() {
        this.stk = new Stack() ;
        this.minStk = new Stack() ;
    }
    
    public void push(int val) {
        stk.push(val) ;
        if((!minStk.isEmpty()) && (minStk.peek() >= val)) {
            minStk.push(val) ;
        } else if (minStk.isEmpty()) {
            minStk.push(val) ;
        }
    }
    
    public void pop() {
        if(stk.isEmpty()) return ;

        int val = stk.pop() ;
        if(minStk.peek() == val) {
            minStk.pop() ;
        }
    }
    
    public int top() {
        return stk.peek() ;
    }
    
    public int getMin() {
        return minStk.peek() ;
    }
}
