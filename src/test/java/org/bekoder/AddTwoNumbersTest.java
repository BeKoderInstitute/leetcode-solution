package org.bekoder;

import org.bekoder.model.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers solution = new AddTwoNumbers();

        // Test Case 1
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);

        // Test Case 2
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode result2 = solution.addTwoNumbers(l3, l4);
        assertEquals(0, result2.val);
        assertNull(result2.next);

        // Test Case 3
        ListNode l5 = new ListNode(9);
        l5.next = new ListNode(9);
        l5.next.next = new ListNode(9);
        l5.next.next.next = new ListNode(9);
        l5.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next.next = new ListNode(9);

        ListNode l6 = new ListNode(9);
        l6.next = new ListNode(9);
        l6.next.next = new ListNode(9);
        l6.next.next.next = new ListNode(9);

        ListNode result3 = solution.addTwoNumbers(l5, l6);
        assertEquals(8, result3.val);
        assertEquals(9, result3.next.val);
        assertEquals(9, result3.next.next.val);
        assertEquals(9, result3.next.next.next.val);
        assertEquals(0, result3.next.next.next.next.val);
        assertEquals(0, result3.next.next.next.next.next.val);
        assertEquals(0, result3.next.next.next.next.next.next.val);
        assertEquals(1, result3.next.next.next.next.next.next.next.val);
        assertNull(result3.next.next.next.next.next.next.next.next);
    }
}
