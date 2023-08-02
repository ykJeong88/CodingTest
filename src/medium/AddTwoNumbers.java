package medium;

import java.util.*;
import java.util.Stack;

public class AddTwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode a = l1, b=l2;
        ListNode answer = null;
        int over = 0;

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listPadding = new ArrayList<>();
        Stack<Integer> stackC = new Stack<>();

        // 1. padding
        while (a != null || b != null) {
            
            int anum, bnum = 0;
            
            if ( a != null ) {
                anum = a.val;
                a = a.next;
                listA.add(anum);
            } else {
                listPadding.add(0);
            }
            
            if ( b != null) {
                bnum = b.val;
                b = b.next;
                listB.add(bnum);
            } else {
                listPadding.add(0);
            }
        }

        if(listA.size() >  listB.size()) {
            listB.addAll(listPadding);
        } else if(listA.size() <  listB.size()) {
            listA.addAll(listPadding);
        }

        for(int i = 0; i < listA.size(); i++) {
            int anum = listA.get(i);
            int bnum = listB.get(i);
            int sum = anum + bnum;

            if (anum + bnum + over >= 10)  {
                sum = sum + over - 10;
                over = 1;
                stackC.push(sum);
            } else {
                sum = sum + over;
                over = 0;
                stackC.push(sum);
            }
        }

        if(over == 1) stackC.push(over);

        while(!stackC.isEmpty()) {
            if(answer == null) answer = new ListNode(stackC.pop());
            else answer = new ListNode(stackC.pop(), answer);
        }

        return answer;
    }


}
