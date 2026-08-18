class Solution {
    class Info implements Comparable<Info>{
        int n ;
        int f ;

        Info(int n , int f) {
            this. n = n ;
            this.f = f ;
        }

        public int compareTo(Info i2) {
            return this.f - i2.f ;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> freqMap = new HashMap<>() ;
        for(int n : nums) {
            freqMap.put(n , freqMap.getOrDefault(n , 0) + 1) ;
        }
        PriorityQueue<Info> pq = new PriorityQueue<>() ;
        for(int key : freqMap.keySet()) {
            pq.add(new Info(key , freqMap.get(key))) ;
            if(pq.size() > k) {
                pq.remove() ;
            }
        }
        int[] ans = new int[pq.size()] ;
        for(int i = 0 ; i < ans.length ; i++) {
            ans[i] = pq.remove().n ;
        }
        return ans ;
    }
}
