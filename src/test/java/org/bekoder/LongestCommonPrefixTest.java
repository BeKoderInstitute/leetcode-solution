package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix_Case1() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @Test
    public void testLongestCommonPrefix_Case2() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {"dog", "racecar", "car"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    public void testLongestCommonPrefix_Case3() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {"apple", "app", "apartment"};
        assertEquals("ap", solution.longestCommonPrefix(strs));
    }

    @Test
    public void testLongestCommonPrefix_Case4() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {"abcd", "ab", "abc"};
        assertEquals("ab", solution.longestCommonPrefix(strs));
    }

    @Test
    public void testLongestCommonPrefix_Case5() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {"a", "b", "c"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    public void testLongestCommonPrefix_Case6() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    // Add more test cases as needed
}
