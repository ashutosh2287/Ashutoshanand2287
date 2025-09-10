/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Insert copy nodes after each original node
        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }

        // Step 2: Assign random pointers to copy nodes
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next; // jump to next original
        }

        // Step 3: Separate the two lists
        cur = head;
        Node dummyHead = new Node(0);
        Node copyCur = dummyHead;

        while (cur != null) {
            Node copy = cur.next;
            cur.next = copy.next; // restore original list

            copyCur.next = copy;  // add to copied list
            copyCur = copy;

            cur = cur.next;
        }

        return dummyHead.next;
    }
}
