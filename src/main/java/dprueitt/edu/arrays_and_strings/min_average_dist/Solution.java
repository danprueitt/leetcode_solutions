package dprueitt.edu.arrays_and_strings.min_average_dist;

public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( new Solution().minimumAverageDifference( new int[] { 0, 4, 3, 0, 0 } ) );
    }


    public int minimumAverageDifference( int[] nums )
    {
        long leftHalf = 0, total = 0, minDist = Integer.MAX_VALUE;
        for( int num : nums )
        {
            total += num;
        }

        int ans = 0, len = nums.length;
        for( int i = 0; i < len; i++ )
        {
            leftHalf += nums[i];
            long rightHalf = total - leftHalf;

            long leftAvg = leftHalf / (i + 1);
            long rightAvg = len - 1 == i ? 0 : rightHalf / (len - 1 - i);
            long avg = Math.abs( leftAvg - rightAvg );

            if( avg < minDist )
            {
                minDist = avg;
                ans = i;
            }
        }

        return ans;
    }
}
