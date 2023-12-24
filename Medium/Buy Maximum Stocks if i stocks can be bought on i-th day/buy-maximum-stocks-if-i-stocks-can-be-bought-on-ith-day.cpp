//{ Driver Code Starts
/* Driver program to test above function */

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]){
        //Write your code here
        vector<pair<int,int>> v;
        for(int i = 0;i<n;i++) v.push_back({price[i], i+1});
        sort(v.begin(),v.end());
        
        int i = 0;
        int stocks = 0;
        
        while(v[i].first <= k) {
            int stocksCanBeBought = v[i].second;
            int cost = v[i].first*stocksCanBeBought;
            if(k>=cost) {
                stocks+=stocksCanBeBought;
                k-=cost;
            }
            else {
                stocks += k/v[i].first;
                break;
            }
            i++;
        }
        return stocks;
    }
};


//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int n, k;
	    cin >> n >> k;
	    int price[n];
	    for(int i = 0 ; i < n; i++){
	        cin >> price[i];
	    }
	    Solution ob;
	    int ans = ob.buyMaximumProducts(n, k, price);
	    cout << ans<<endl;
	}
	return 0;
}

// } Driver Code Ends