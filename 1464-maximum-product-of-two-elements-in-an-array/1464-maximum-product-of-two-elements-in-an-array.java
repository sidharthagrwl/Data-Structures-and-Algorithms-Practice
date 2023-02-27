class Solution {
    public int maxProduct(int[] nums) {
        
        int ans = 0;
        
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                int prd = ((nums[i]-1) * (nums[j]-1));
                if(prd > ans) ans = prd;
            }
        }
        
        return ans;
    }
}