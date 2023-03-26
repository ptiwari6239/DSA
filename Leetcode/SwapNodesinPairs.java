//
//// leetcode     question :- 24
//public class SwapNodesinPairs {
//    public ListNode swapPairs(ListNode head) {
//        if(head == null)
//            return null;
//        if(head.next == null)
//            return head;
//        ListNode pointer1 = head;
//        ListNode pointer2 = pointer1.next;
//        int temp = pointer1.val;
//        pointer1.val = pointer2.val;
//        pointer2.val = temp;
//        head = pointer1;
//        while(pointer2.next != null && pointer1.next != null){
//            pointer1 = pointer1.next.next;
//            if(pointer1.next == null)
//                return head;
//
//            pointer2 = pointer1.next;
//            temp = pointer1.val;
//            pointer1.val = pointer2.val;
//            pointer2.val = temp;
//
//        }
//
//        return head;
//
//    }
//
//}
