class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> values = new ArrayList<>();
        while (list1 != null) {
            values.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            values.add(list2.val);
            list2 = list2.next;
        }
    Collections.sort(values);
    ListNode temp = new ListNode(-1);
    ListNode current = temp;
    for (int val : values) {
        current.next = new ListNode(val);
        current = current.next;
    }
    return temp.next;
    }
}
