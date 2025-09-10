class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Step 1: Create a dummy node
        ListNode dummy = new ListNode(-1); // dummy placeholder
        ListNode current = dummy; // this will move and build the new list

        // Step 2: Traverse both lists
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                current.next = list1; // attach the smaller node
                list1 = list1.next;   // move in list1
            } else {
                current.next = list2; // attach the smaller node
                list2 = list2.next;   // move in list2
            }

            current = current.next; // move the current pointer forward
        }

        // Step 3: Attach the remaining part of list1 or list2
        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Step 4: return the merged list starting from dummy.next
        return dummy.next;
    }
}
