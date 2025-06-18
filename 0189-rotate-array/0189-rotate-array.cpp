// Time Complexity: O(n), Space Complexity: O(n)
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        if (n == 0) return;
        
        k = k % n;
        if (k == 0) return;
        
        vector<int> temp(n);
        
        // Copy the last k elements to the beginning of temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        
        // Copy the first n-k elements to the remaining positions in temp
        for (int i = 0; i < n - k; i++) {
            temp[k + i] = nums[i];
        }
        
        // Assign temp back to nums
        nums = temp;
    }
};