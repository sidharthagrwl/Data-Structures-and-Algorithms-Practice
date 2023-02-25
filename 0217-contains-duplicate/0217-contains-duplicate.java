class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++) {
            int count = 1;
            if(nums[i] == nums[i+1]) count++;
            if(count > 1) return true;
        }
        
        return false;
    }
}