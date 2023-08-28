package org.bekoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testFindMedianSortedArrays() {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.00001);
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.00001);
        assertEquals(5.0, solution.findMedianSortedArrays(new int[]{1, 5, 9}, new int[]{2, 3, 7, 8}), 0.00001); // Corrected expected value
    }
}

