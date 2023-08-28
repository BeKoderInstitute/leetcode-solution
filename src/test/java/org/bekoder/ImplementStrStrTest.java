package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ImplementStrStrTest {

    @Test
    public void testStrStr() {
        ImplementStrStr solution = new ImplementStrStr();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int index1 = solution.strStr(haystack1, needle1);
        assertThat(index1, equalTo(0));

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int index2 = solution.strStr(haystack2, needle2);
        assertThat(index2, equalTo(-1));

        // Additional test cases
        String haystack3 = "hello";
        String needle3 = "";
        int index3 = solution.strStr(haystack3, needle3);
        assertThat(index3, equalTo(0));

        String haystack4 = "hello";
        String needle4 = "lo";
        int index4 = solution.strStr(haystack4, needle4);
        assertThat(index4, equalTo(3));

        String haystack5 = "abcdefg";
        String needle5 = "xyz";
        int index5 = solution.strStr(haystack5, needle5);
        assertThat(index5, equalTo(-1));
    }

}
