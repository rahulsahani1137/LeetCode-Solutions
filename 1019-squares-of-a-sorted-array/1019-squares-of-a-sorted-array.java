class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int index = n - 1;
        int leftPointer = 0;
        int rightPointer = n - 1;
        while(leftPointer <= rightPointer){
            int squareOfLeft = nums[leftPointer] * nums[leftPointer];
            int squareOfRight = nums[rightPointer] * nums[rightPointer];
            if(squareOfRight > squareOfLeft){
                result[index] = squareOfRight;
                rightPointer --;
            } else {
                 result[index] = squareOfLeft;
                 leftPointer ++;
            }
            index --;
        }
        return result;
    } 
}