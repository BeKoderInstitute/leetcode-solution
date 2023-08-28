package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchRangeTest {
    @Test
    public void testExample1() {
        SearchRange solution = new SearchRange();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        int[] result = solution.searchRange(nums, target);
        assertThat(result, is(expected));
    }

    @Test
    public void testExample2() {
        SearchRange solution = new SearchRange();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        int[] result = solution.searchRange(nums, target);
        assertThat(result, is(expected));
    }

    @Test
    public void testExample3() {
        SearchRange solution = new SearchRange();
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        int[] result = solution.searchRange(nums, target);
        assertThat(result, is(expected));
    }

    // Add more test cases as needed
}
