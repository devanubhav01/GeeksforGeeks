class Solution {
  public:
    int powerfulInteger(vector<vector<int>>& arr, int k) {
        // code here
        map<int,int>mp;
        for(int i=0;i<arr.size();i++)
        {
            mp[arr[i][0]]++;
            --mp[arr[i][1]+1];
        }
        bool check=false;
        int ans=-1;
        int sum=0;
        for(auto itr:mp)
        {
            sum+=itr.second;
            if(sum>=k)
            {
                ans=max(ans,itr.first);
                check=true;
            }
            else if(check)
            {
                ans=max(ans,itr.first-1);
                check=false;
            }
        }
        return ans;
    }
    
    
};