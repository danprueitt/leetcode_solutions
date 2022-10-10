package dprueitt.edu.arrays_and_strings.num_of_zero_filled_subarrays;

public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( new Solution().zeroFilledSubarray( new int[] { 1, 3, 0, 0, 2, 0, 0, 4 } ) );
    }


    public long zeroFilledSubarray( int[] nums )
    {
        long ans = 0;
        int left = 0;
        int curr = 0;

        for( int right = 0; right < nums.length; right++ )
        {
            curr += nums[right];
            while( curr != 0 )
            {
                curr -= nums[left];
                left++;
            }
            ans += right - left + 1;
        }

        return ans;
    }
}
