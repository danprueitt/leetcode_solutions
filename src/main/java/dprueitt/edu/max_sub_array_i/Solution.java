package dprueitt.edu.max_sub_array_i;

public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( new Solution().findMaxAverage( new int[] { 1, 12, -5, -6, 50, 3 }, 4 ) );
    }


    public double findMaxAverage( int[] nums, int k )
    {
        int sum = 0;

        for( int i = 0; i < k; i++ )
        {
            sum += nums[i];
        }

        int ans = sum;
        for( int i = k; i < nums.length; i++ )
        {
            sum += nums[i] - nums[i - k];
            ans = Math.max( ans, sum );
        }

        return (double) ans / (double) k;
    }
}
