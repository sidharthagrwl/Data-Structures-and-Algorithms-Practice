class Solution {
public:
    bool isPowerOfTwo(int n) {
        
        int count = 0;
        while(n>0) {
            if((n&1) == 1) count++;
            n >>= 1;
        }
        
        if(count == 1) return true;
        return false;
    }
};