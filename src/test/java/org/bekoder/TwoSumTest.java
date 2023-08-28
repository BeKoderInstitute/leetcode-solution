package org.bekoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum solution = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        int[] result1 = solution.twoSum(nums1, target1);
        assertArrayEquals(expected1, result1);

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        int[] result2 = solution.twoSum(nums2, target2);
        assertArrayEquals(expected2, result2);

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        int[] result3 = solution.twoSum(nums3, target3);
        assertArrayEquals(expected3, result3);

        // Test case with no solution
        int[] nums4 = {1, 2, 3, 4, 5};
        int target4 = 10;
        assertThrows(IllegalArgumentException.class, () -> solution.twoSum(nums4, target4));
    }
}
