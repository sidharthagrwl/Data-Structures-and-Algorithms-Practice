class Solution {
public:
    int missingNumber(vector<int>& nums) {
        
        int orgsum = 0;
        for(int i=0;i<=nums.size();i++)
            orgsum += i;
        
        int sum = 0;
        for(auto x: nums)
            sum += x;
        
        return (orgsum - sum);
    }
};