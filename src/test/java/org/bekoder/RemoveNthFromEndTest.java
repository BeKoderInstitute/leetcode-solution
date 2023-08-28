package org.bekoder;

import org.bekoder.model.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthFromEndTest {

    @Test
    public void testRemoveNthFromEnd_Example1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        RemoveNthFromEnd solution = new RemoveNthFromEnd();
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        assertEquals(expected, solution.removeNthFromEnd(head, 2));
    }

    @Test
    public void testRemoveNthFromEnd_SingleNode() {
        ListNode head = new ListNode(1);
        RemoveNthFromEnd solution = new RemoveNthFromEnd();
        assertNull(solution.removeNthFromEnd(head, 1));
    }

    @Test
    public void testRemoveNthFromEnd_TwoNodes() {
        ListNode head = new ListNode(1, new ListNode(2));
        RemoveNthFromEnd solution = new RemoveNthFromEnd();
        ListNode expected = new ListNode(1);
        assertEquals(expected, solution.removeNthFromEnd(head, 1));
    }

}
