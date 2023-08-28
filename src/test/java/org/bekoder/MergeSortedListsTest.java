package org.bekoder;

import org.bekoder.model.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeSortedListsTest {

    @Test
    public void testMergeTwoLists_Example1() {
        MergeSortedLists solution = new MergeSortedLists();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode result = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, result);
    }

    @Test
    public void testMergeTwoLists_EmptyLists() {
        MergeSortedLists solution = new MergeSortedLists();
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode result = solution.mergeTwoLists(list1, list2);
        assertNull(result);
    }

    @Test
    public void testMergeTwoLists_OneListEmpty() {
        MergeSortedLists solution = new MergeSortedLists();
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        ListNode result = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, result);
    }
}
