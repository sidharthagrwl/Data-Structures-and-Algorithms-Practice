//{ Driver Code Starts


#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
	public:
		vector<int> find_sum(int n)
		{
		    // Code here
		    
		    vector<int> ans;
		    int oddSum=0, evenSum=0;
		    
		    for(int i=1;i<=n;i++) {
		        if(i%2==0) evenSum += i;
		        else oddSum += i;
		    }
		    
		    ans.push_back(oddSum);
		    ans.push_back(evenSum);
		    
		    return ans;

		}
};

//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n;
    	cin >> n;
    	Solution ob;
    	vector<int> ans = ob.find_sum(n);
    	for(auto i: ans)
    		cout << i << " ";
    	cout<<"\n";
    }
	return 0;
}
// } Driver Code Ends