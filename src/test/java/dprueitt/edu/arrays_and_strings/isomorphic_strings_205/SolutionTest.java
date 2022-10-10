package dprueitt.edu.arrays_and_strings.isomorphic_strings_205;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest
{

    private static Stream<Arguments> isIsomorphic()
    {
        return Stream.of(
                Arguments.of( "egg", "add", true ),
                Arguments.of( "foo", "bar", false ),
                Arguments.of( "paper", "title", true )
        );
    }


    @ParameterizedTest
    @MethodSource
    void isIsomorphic( String s, String t, boolean expected )
    {
        assertEquals( expected, new Solution().isIsomorphic( s, t ) );
    }
}