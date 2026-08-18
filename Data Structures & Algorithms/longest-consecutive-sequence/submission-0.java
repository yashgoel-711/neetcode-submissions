class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ;
        for(int n : nums) {
            set.add(n) ;
        }
        int ans = 0;
        for(int n : nums) {
            if(!set.contains(n - 1)) {
                int count = 1 ;
                int num = n ;
                while(set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(ans , count);
            }
        }
        return ans ;
    }
}
