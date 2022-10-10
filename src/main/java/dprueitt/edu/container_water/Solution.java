package dprueitt.edu.container_water;

public class Solution
{
    public static void main( String[] args )
    {
        System.out.println(new Solution().maxArea( new int[]{1,8,6,2,5,4,8,3,7} ));
    }


    public int maxArea( int[] height )
    {
        int maxWater = -1;
        int left = 0;
        int right = height.length - 1;

        while( left < right )
        {
            final int leftBar = height[left];
            final int rightBar = height[right];
            final int xAxis = right - left;
            int thisMax;

            if( leftBar > rightBar )
            {
                thisMax = rightBar * xAxis;
                right--;
            }
            else
            {
                thisMax = leftBar * xAxis;
                left++;
            }

            if (thisMax > maxWater) {
                maxWater = thisMax;
            }
        }
        return maxWater;
    }
}
