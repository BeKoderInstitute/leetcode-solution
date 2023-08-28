package org.bekoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringTest {

    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstring solution = new LongestSubstring();

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
        assertEquals(6, solution.lengthOfLongestSubstring("abcdef"));
        assertEquals(6, solution.lengthOfLongestSubstring("abcdeffgh"));
    }
}

