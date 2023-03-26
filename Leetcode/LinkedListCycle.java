// leetcode question :- 141
//public class LinkedListCycle {
//    public boolean hasCycle(ListNode head) {
//        if(head == null || head.next == null)
//            return false;
//        ListNode m1 = head;
//        ListNode m2 = head.next;
//        while(m2 != null ){
//            if(m1 == m2)
//                return true;
//            if(m2.next == null)
//                return false;
//            m1 = m1.next;
//            m2 = m2.next.next;
//        }
//        return false;
//    }
//}
