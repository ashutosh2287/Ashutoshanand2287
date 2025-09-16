class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Agar list empty hai ya single node hai -> directly return
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;

        // Jab tak current aur next node exist karte hain
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // Duplicate mila -> skip kar do
                curr.next = curr.next.next;
            } else {
                // Nahi to normal aage badho
                curr = curr.next;
            }
        }

        return head;
    }
}
