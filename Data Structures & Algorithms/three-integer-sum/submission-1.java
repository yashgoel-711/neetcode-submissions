class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums) ;
        Set<List<Integer>> ans = new HashSet<>() ;
        List<Integer> sub = new ArrayList<>() ;
        sub.add(-1);
        sub.add(-1);
        sub.add(-1);

        for(int i = 0 ; i < nums.length - 2 ; i++) {
            int j = i + 1 ;
            int k = nums.length - 1 ;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k] ;
                if(sum == 0) {
                    sub.set(0 , nums[i]);
                    sub.set(1 , nums[j]);
                    sub.set(2 , nums[k]);
                    ans.add(new ArrayList<>(sub)) ;
                    j++;
                    k--;
                }
                else if(sum < 0) {
                    j++;
                } 
                else {
                    k--;
                }
            }
        }
        return new ArrayList<>(ans) ;
    }
}
