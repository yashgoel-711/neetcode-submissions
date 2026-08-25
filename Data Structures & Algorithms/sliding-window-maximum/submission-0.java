class Solution {
    class Info implements Comparable<Info>{
        int num ;
        int idx ;

        Info(int n , int i) {
            this.num = n ;
            this.idx = i ;
        }

        public int compareTo(Info i2) {
            return i2.num - this.num ;
        }

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Info> pq = new PriorityQueue<>() ;
        int ans[] = new int[nums.length - k + 1] ;
        int j = 0;

        int l = 0 ;
        int r = -1 ;

        while(r < nums.length - 1) {
            r++ ;
            pq.add(new Info(nums[r] , r)) ;

            if((r - l + 1) > k) {
                l++ ;
            } 

            if((r - l + 1) == k) {
                while(pq.peek().idx < l) {
                    pq.remove() ;
                }
                int max = pq.peek().num ;
                ans[j] = max ;
                j++ ; 
            }
        }
        return ans ;
    }
}
