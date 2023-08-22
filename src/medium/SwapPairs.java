package medium;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode temp = head;

        while(true) {

            if(temp.next == null) break;

            int nowVal = temp.val;
            temp.val = temp.next.val;
            temp.next.val = nowVal;

            if(temp.next.next == null) break;
            temp = temp.next.next;
        }

        return head;
    }
}
