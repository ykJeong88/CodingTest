package medium;

import java.util.ArrayList;
import java.util.List;

public class NthNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {


        n = 2;
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))) );
        List<Integer> list = new ArrayList<>();

        while(head != null) {
            int num = head.val;
            head = head.next;
            list.add(num);
        }

        list.remove(list.size() - n);
        ListNode answer = new ListNode(list.get(list.size()-1));
        for(int i = list.size() - 2; i >= 0; i--) {

            answer = new ListNode(list.get(i), answer );
        }

        if(list.size() == 1) return new ListNode();

        while(answer != null) {
            int num = answer.val;
            answer = answer.next;
            System.out.println(num);
        }

        return answer;
    }

}





