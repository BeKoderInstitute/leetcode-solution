package org.bekoder;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        assertThat(k1, equalTo(2));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        assertThat(k2, equalTo(5));

        int[] nums3 = {};
        int k3 = solution.removeDuplicates(nums3);
        assertThat(k3, equalTo(0));

        int[] nums4 = {1, 1, 1, 1, 1};
        int k4 = solution.removeDuplicates(nums4);
        assertThat(k4, equalTo(1));

        int[] nums5 = {1, 2, 3, 4, 5};
        int k5 = solution.removeDuplicates(nums5);
        assertThat(k5, equalTo(5));

        int[] nums6 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int k6 = solution.removeDuplicates(nums6);
        assertThat(k6, equalTo(4));

        int[] nums7 = {-1, 0, 0, 0, 1, 1, 1, 2, 2, 2};
        int k7 = solution.removeDuplicates(nums7);
        assertThat(k7, equalTo(4));

        int[] nums8 = {10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 40};
        int k8 = solution.removeDuplicates(nums8);
        assertThat(k8, equalTo(4));

        int[] nums9 = {-5, -5, -4, -3, -3, -2, -2, -1, -1, 0};
        int k9 = solution.removeDuplicates(nums9);
        assertThat(k9, equalTo(6));

        int[] nums10 = {-2, -2, -1, -1, 0, 0, 1, 1, 2, 2};
        int k10 = solution.removeDuplicates(nums10);
        assertThat(k10, equalTo(5));
    }

}
