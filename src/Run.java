import medium.AddTwoNumbers;

public class Run {

    public static void main(String[] args) {

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(1
                                    , new AddTwoNumbers.ListNode(9
                                    , new AddTwoNumbers.ListNode(9
                , new AddTwoNumbers.ListNode(9
                , new AddTwoNumbers.ListNode(9
                , new AddTwoNumbers.ListNode(9
                , new AddTwoNumbers.ListNode(9
                , new AddTwoNumbers.ListNode(9
                , new AddTwoNumbers.ListNode(9
                , new AddTwoNumbers.ListNode(9))))))))));

        addTwoNumbers.addTwoNumbers(l1,l2);


    }
}
