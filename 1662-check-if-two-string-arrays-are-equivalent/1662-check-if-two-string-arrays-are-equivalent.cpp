class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        
        string s1 = "", s2 = "";
        
        for(auto x: word1) s1 += x;
        for(auto x: word2) s2 += x;
        
        int i=0;
        while(i<s1.size() || i<s2.size()) {
            if(s1[i] != s2[i]) return false;
            i++;
        }
        
        return true;
    }
};