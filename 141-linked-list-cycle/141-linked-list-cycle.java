
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        ListNode temp = head;
        
        while(node !=null && node.next !=null){
            node = node.next.next;
            temp = temp.next;
                
            if(temp == node){
                return true;
            }
        }
        return false;
    }
}