package org.bekoder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    @Test
    public void testThreeSum_Example1() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    public void testThreeSum_EmptyArray() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    public void testThreeSum_AllPositive() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    public void testThreeSum_AllNegative() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-5, -2, -1, -3, -4};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    public void testThreeSum_MixedPositiveNegative() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, solution.threeSum(nums));
    }
}


