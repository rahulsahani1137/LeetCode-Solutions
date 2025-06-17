class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> prefixArray(nums.size());
        if (nums.empty()) return prefixArray;
        
        prefixArray[0] = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            prefixArray[i] = prefixArray[i-1] + nums[i];
        }
        return prefixArray;
    }
};