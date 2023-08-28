package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

        assertThat(solution.longestPalindrome("babad"), anyOf(is("bab"), is("aba")));
        assertThat(solution.longestPalindrome("cbbd"), is("bb"));
        assertThat(solution.longestPalindrome("a"), is("a"));
        assertThat(solution.longestPalindrome("aaa"), is("aaa"));
        assertThat(solution.longestPalindrome("babcba"), is("abcba"));
        assertThat(solution.longestPalindrome("aibohphobia"), is("aibohphobia"));
        assertThat(solution.longestPalindrome("racecar"), is("racecar"));
        assertThat(solution.longestPalindrome("abb"), is("bb"));
    }
}

