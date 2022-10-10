package dprueitt.edu.container_water;

class Solution {
    public int maxArea(int[] height)
    {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while( left < right )
        {
            final int leftBar = height[left];
            final int rightBar = height[right];
            final int xAxis = right - left;
            final int currentArea = Math.min(leftBar, rightBar) * xAxis;
            maxWater = Math.max(maxWater, currentArea);

            if( leftBar > rightBar )
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxWater;
    }
}