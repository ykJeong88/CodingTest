package medium;

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
        int suma = 0;
        int sumb = 0;
        int count = 1;
        ListNode answer = null;

        while (a != null || b != null) {
            if(a != null) {
                suma += a.val * count;
                a = a.next;
            }

            if(b != null) {
                sumb += b.val * count;
                b = b.next;
            }

            count = count * 10;

        }

        int result = suma + sumb;
        int resultSize = String.valueOf(result).length();

        for(int i = 0; i < resultSize ; i++) {
            int num = Integer.parseInt(String.valueOf(String.valueOf(result).charAt(i)));
            if(answer == null) {
                answer = new ListNode(num);
            } else {
                answer = new ListNode(num, answer);
            }
        }

        return answer;
    }


}
