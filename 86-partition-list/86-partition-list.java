class Solution {
  public ListNode partition(ListNode head, int x) {
        if (head == null)
            return head;
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (head != null) {
            if (head.val < x) {
                stack1.push(head);
            } else {
                stack2.push(head);
            }
            head = head.next;
        }
        head = null;
        while (!stack2.isEmpty()) {
            ListNode pop = stack2.pop();
            pop.next = head;
            head = pop;
        }
        while (!stack1.isEmpty()) {
            ListNode pop = stack1.pop();
            pop.next = head;
            head = pop;
        }
        return head;
    }

}