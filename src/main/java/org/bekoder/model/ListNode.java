package org.bekoder.model;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNode other = (ListNode) obj;
        return val == other.val && Objects.equals(next, other.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
