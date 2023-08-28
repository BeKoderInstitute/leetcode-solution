package org.bekoder;

import org.bekoder.model.ListNode;
import org.junit.jupiter.api.Test;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MergingKSortedListsTest {

    @Test
    public void testMergeKListsExample1() {
        ListNode[] lists = new ListNode[]{
                createLinkedList(new int[]{1, 4, 5}),
                createLinkedList(new int[]{1, 3, 4}),
                createLinkedList(new int[]{2, 6})
        };
        ListNode expected = createLinkedList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        MergingKSortedLists solution = new MergingKSortedLists();
        ListNode result = solution.mergeKLists(lists);
        assertThat(result, isLinkedListEqualTo(expected));
    }

    @Test
    public void testMergeKListsExample2() {
        ListNode[] lists = new ListNode[]{};
        MergingKSortedLists solution = new MergingKSortedLists();
        ListNode result = solution.mergeKLists(lists);
        assertThat(result, is(nullValue()));
    }

    @Test
    public void testMergeKListsExample3() {
        ListNode[] lists = new ListNode[]{null};
        MergingKSortedLists solution = new MergingKSortedLists();
        ListNode result = solution.mergeKLists(lists);
        assertThat(result, is(nullValue()));
    }

    // Helper methods for creating linked lists and comparing them
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private Matcher<ListNode> isLinkedListEqualTo(ListNode expected) {
        return new TypeSafeMatcher<ListNode>() {
            @Override
            protected boolean matchesSafely(ListNode item) {
                ListNode currentA = expected;
                ListNode currentB = item;
                while (currentA != null && currentB != null) {
                    if (currentA.val != currentB.val) {
                        return false;
                    }
                    currentA = currentA.next;
                    currentB = currentB.next;
                }
                return currentA == null && currentB == null;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("linked list is equal to ").appendValue(expected);
            }
        };
    }
}
