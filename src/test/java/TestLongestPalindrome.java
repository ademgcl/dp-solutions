import longestpalindrome.SolutionLongestPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by adem on 26/12/2016.
 */
public class TestLongestPalindrome {

    @Test
    public void testDifferentValues(){
        SolutionLongestPalindrome longestPalindrome = new SolutionLongestPalindrome();

        assertEquals("adada",longestPalindrome.solvePalindrome("2adada"));
        assertEquals("aa",longestPalindrome.solvePalindrome("aadem"));
    }
}
