class Solution {
    public int missingNumber(int[] nums) {
        
        int orgSum = 0;
        
        for(int i=1;i<=nums.length;i++) {
            orgSum += i;
        }
        
        int sum = 0;
        for(int x: nums) {
            sum += x;
        }
        
        return (orgSum - sum);
    }
}