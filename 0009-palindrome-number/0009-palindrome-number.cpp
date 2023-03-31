class Solution {
public:
    bool isPalindrome(int x) {
        
        if(x<0) return false;
        
        vector<int> a;
        while(x>0) {
            a.push_back(x%10);
            x /= 10;
        }
        
        for(int i=0;i<a.size();i++) {
            if(a[i] != a[a.size()-i-1]) return false;
        }
        
        return true;
    }
};