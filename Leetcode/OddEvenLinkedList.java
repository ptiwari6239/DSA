//
////leetcode question:- 328
//public class OddEvenLinkedList {
//    public ListNode oddEvenList(ListNode head) {
//        if(head==null || head.next == null || head.next.next == null )
//            return head;
//        ListNode oddpt = head;
//        ListNode evenpt = head.next;
//        ListNode evenhead = evenpt;
//        while(evenpt != null && evenpt.next != null){
//            oddpt.next = oddpt.next.next;
//            evenpt.next = evenpt.next.next;
//            oddpt = oddpt.next;
//            evenpt = evenpt.next;
//
//
//        }
//        oddpt.next = evenhead;
//        return head;
//    }
//}
