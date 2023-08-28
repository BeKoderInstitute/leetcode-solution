package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RotatedArraySearchTest {
    @Test
    public void testExample1() {
        RotatedArraySearch solution = new RotatedArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;
        int result = solution.search(nums, target);
        assertThat(result, is(expected));
    }

    @Test
    public void testExample2() {
        RotatedArraySearch solution = new RotatedArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        int result = solution.search(nums, target);
        assertThat(result, is(expected));
    }

    @Test
    public void testExample3() {
        RotatedArraySearch solution = new RotatedArraySearch();
        int[] nums = {1};
        int target = 0;
        int expected = -1;
        int result = solution.search(nums, target);
        assertThat(result, is(expected));
    }

}
