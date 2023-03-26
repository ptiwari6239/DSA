
//// leetcode question :- 206
//public class ReverseLinkedList {
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null)
//            return head;
//        if(head.next.next == null){
//            ListNode ptr = head.next;
//            ptr.next = head;
//            head.next = null;
//            return ptr;
//        }
//        ListNode pptr = head;
//        ListNode ptr = head.next;
//        head.next = null;
//        ListNode nptr = ptr.next;
//        while(nptr!=null){
//            ptr.next = pptr;
//            pptr = ptr;
//            ptr = nptr;
//            nptr = nptr.next;
//        }
//        ptr.next = pptr;
//        return ptr;
//
//    }
//
//}
