class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>() ;
        List<Integer> sub = new ArrayList<>() ;
        sub.add(-1);
        sub.add(-1);
        sub.add(-1);

        for(int i = 0 ; i < nums.length - 2 ; i++) {
            HashMap<Integer , Integer> map = new HashMap<>() ;
            for(int j = i + 1 ; j < nums.length ; j++) {
                if(map.containsKey(-(nums[i] + nums[j]))) {
                    sub.set(0 , nums[i]);
                    sub.set(1 , nums[j]);
                    sub.set(2 , -(nums[i] + nums[j]));
                    Collections.sort(sub);
                    ans.add(new ArrayList<>(sub)) ;
                }
                map.put(nums[j] , j) ;
            }
        }

        return new ArrayList<>(ans) ;
    }
}
