class Solution {
    public int trap(int[] height) {
        //Creating auxillary arrays
        //Left max Boundary Array
        int[] leftMaxBoundary = new int[height.length];
        leftMaxBoundary[0] = height[0];
        //Adding to left max boundary
        for(int i = 1; i < height.length-1; i++){
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
        }

        //Creating Right Max Array
        int[] rightMaxBoundary = new int[height.length];
        rightMaxBoundary[height.length - 1] = height[height.length - 1];
        //Adding to right max boundary
        for(int i = height.length - 2; i >= 0; i--){
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }

        //For Trapped Water
        int trappedWater = 0;
        for(int i = 0; i < height.length-1; i++){
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
    
}