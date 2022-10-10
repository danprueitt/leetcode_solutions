package dprueitt.edu.arrays_and_strings.isomorphic_strings_205;

import java.util.HashMap;
import java.util.Map;

class Solution
{
    public boolean isIsomorphic( String s, String t )
    {
        if( s == null || t == null )
        {
            return false;
        }

        final Map<Character, Character> mapping_s_t = new HashMap<>();
        final Map<Character, Character> mapping_t_s = new HashMap<>();

        for( int i = 0; i < s.length(); i++ )
        {
            final char sChar = s.charAt( i );
            final char tChar = t.charAt( i );
            final Character sTLookup = mapping_s_t.get( sChar );

            if( sTLookup == null )
            {
                mapping_s_t.put( sChar, tChar );
            }
            else if( sTLookup != tChar )
            {
                return false;
            }

            final Character tSLookup = mapping_t_s.get( tChar );
            if( tSLookup == null )
            {
                mapping_t_s.put( tChar, sChar );
            }
            else if( tSLookup != sChar )
            {
                return false;
            }
        }

        return true;
    }
}