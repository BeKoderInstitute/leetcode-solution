package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RegularExpressionMatchingTest {

    @Test
    public void testIsMatchCase1() {
        RegularExpressionMatching solution = new RegularExpressionMatching();

        assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    public void testIsMatchCase2() {
        RegularExpressionMatching solution = new RegularExpressionMatching();

        assertTrue(solution.isMatch("aa", "a*"));
    }

    @Test
    public void testIsMatchCase3() {
        RegularExpressionMatching solution = new RegularExpressionMatching();

        assertTrue(solution.isMatch("ab", ".*"));
    }

    @Test
    public void testIsMatchCase4() {
        RegularExpressionMatching solution = new RegularExpressionMatching();

        assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    public void testIsMatchCase5() {
        RegularExpressionMatching solution = new RegularExpressionMatching();

        assertTrue(solution.isMatch("aab", "c*a*b"));
    }

    @Test
    public void testIsMatchCase6() {
        RegularExpressionMatching solution = new RegularExpressionMatching();

        assertFalse(solution.isMatch("aa", "a"));
    }
}
