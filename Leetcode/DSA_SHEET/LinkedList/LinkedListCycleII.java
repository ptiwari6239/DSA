
// leetcode question:- 142  https://leetcode.com/problems/linked-list-cycle-ii/
// this question can we solved in two ways
// first way :- check if any node is node is already present or not in the hashset
// if not than add it to the hashset and move forward
// if it is present in the hashset than return the node
// and if no node is found and linkedlist is end then return null as linkedlist is non cyclic


// second :- keep two pointer
import java.util.HashSet;

public class LinkedListCycleII {
    public static void main(String[] args){
        LinkedList head = new LinkedList(1);
//        head.next = new LinkedList(2);
//        head.next.next = head;
//        head.next.next.next = new LinkedList(4);
//        head.next.next.next = head.next;
        System.out.println(DetectCycle(head));


    }
    static LinkedList DetectCycle(LinkedList head){
        LinkedList ptr = head;
        HashSet<LinkedList> hs = new HashSet<>();
        if(head==null||head.next==null)
            return null;
        while(ptr.next!=null){
            if(hs.contains(ptr))
                return ptr;
            hs.add(ptr);
            ptr = ptr.next;
        }



        return null;
    }
}
