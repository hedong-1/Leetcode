public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode early = new ListNode();
        ListNode late = new ListNode();
        early = start;
        late = start;
        int count = 0;
        while (late.next != null){
            if (count != n){
                late = late.next;
                count++;
                continue;
            }
            late = late.next;
            early = early.next;
        }
        if (early.next.next == null){
            early.next = null;
        }else {
            early.next = early.next.next;
        }
            return start.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        ListNode b = head;
        while (b != null){
            System.out.println(b.val);
            b= b.next;
        }
        ListNode a = new Solution19().removeNthFromEnd(head, 1);
        System.out.println("--------------");
        while (a != null){
            System.out.println(a.val);
            a = a.next;
        }
    }
}
