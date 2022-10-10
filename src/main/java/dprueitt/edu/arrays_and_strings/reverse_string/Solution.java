package dprueitt.edu.arrays_and_strings.reverse_string;

class Solution
{
    public void reverseString( char[] s )
    {
        final int len = s.length;
        int right = len - 1;
        int left = 0;

        while( left < right )
        {
            char rightChar = s[right];

            s[right] = s[left];
            s[left] = rightChar;

            right--;
            left++;
        }
    }
}