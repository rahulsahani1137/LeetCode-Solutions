class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        // Optimal approach with TC -> O(n) and SC -> O(1)
        for (int j = 1; j < nums.size(); j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
};