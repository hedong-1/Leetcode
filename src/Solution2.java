
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode rest = null;
        int carry =0;
        while (l1!=null || l2!=null){
            int n1,n2;
            if (l1 == null){ n1 = 0;}
                else { n1 = l1.val; }
            if (l2 == null){ n2 = 0;}
                else { n2 = l2.val; }
            int temp = n1 + n2 + carry;
            if (temp >= 10){
                temp -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (head == null){
                head = new ListNode(temp);
                rest = head;
            }else {
                rest.next = new ListNode(temp);
                rest = rest.next;
            }
            if(l1 != null){l1 = l1.next;}
            if(l2 != null){l2 = l2.next;}
        }
        if (carry == 1){ rest.next = new ListNode(1); }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode ans = new Solution2().addTwoNumbers(l1,l2);
        while (ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
