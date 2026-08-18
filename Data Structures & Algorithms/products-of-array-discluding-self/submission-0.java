class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length] ;
        prefixProduct[0] = 1 ;
        for(int i = 1 ; i < nums.length ; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1] ;
        }
        int[] ans = new int[nums.length] ;
        ans[nums.length - 1] = prefixProduct[nums.length - 1] ;
        int suffix = 1; 
        for(int i = nums.length - 2 ; i >= 0 ; i--) {
            suffix *= nums[i+1] ;
            ans[i] = prefixProduct[i] * suffix ;
        }
        return ans;
    } 
}  
