
// leetcode question :- 876 https://leetcode.com/problems/middle-of-the-linked-list/

// the logic is having two pointer slow and fast ,
// move the fast pointer twise as fast as slow pointer by the time fast will reach end of linkedlist
// slow will be on middle node
public class MiddleOfTheLinkedList {
    public static void main(String[] args){
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
//        head.next.next = new LinkedList(3);
//        head.next.next.next = new LinkedList(4);
//        head.next.next.next.next = new LinkedList(5);
//        head.next.next.next.next.next = new LinkedList(6);
        System.out.println(middleNode(head).val);

    }
    static LinkedList middleNode(LinkedList head){
        LinkedList slow=head,fast  = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    
    }
//    static LinkedList middleNode(LinkedList head){
//        LinkedList pt1 = head;
//        LinkedList ptr2 = head ;
//        int ptr2count = 0 ;
//        int ptr1count = 0;
//        if(head.next==null)
//            return head;
//        if(head.next.next == null)
//            return head.next;
//        while(ptr2.next!= null){
//            if(ptr2.next.next==null){
//                ptr2count++;
//                break;
//            }
//            ptr2 = ptr2.next.next;
//            ptr2count++;
//            pt1 = pt1.next;
//            ptr1count++;
//        }
//        if(ptr2count>ptr1count){
//            while(ptr2count!=ptr1count){
//                pt1 = pt1.next;
//                ptr1count++;
//            }
//        }
//        return pt1;
//    }

}
