class Solution {
    class Info {
        int temp ;
        int day ;
        Info(int temp , int day) {
            this.temp = temp ;
            this.day= day ;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Info> stk = new Stack<>() ;
        int[] ans = new int[temperatures.length] ;
        for(int i = temperatures.length - 1 ; i >= 0 ; i--) {
            while((stk.size() > 0) && (stk.peek().temp <= temperatures[i])) {
                stk.pop() ;
            }
            if(stk.size() == 0) {
                ans[i] = 0;
            } else {
                ans[i] = stk.peek().day - i ;
            }
            stk.push(new Info(temperatures[i] , i)) ;
        }
        return ans ;
    }
}
