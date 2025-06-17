class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int, int> mp;
        for(auto x: nums) {
            if(mp.count(x)) return x;
            mp[x]++;
        }      
        return -1;
    }
};