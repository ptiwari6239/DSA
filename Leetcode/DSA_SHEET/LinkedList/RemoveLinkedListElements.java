import java.util.List;

// question:- 203 https://leetcode.com/problems/remove-linked-list-elements/
// logic :-
// firstly check if the head.val is equal to val
// if yes then next node as head and keep check it the head val is not equal to val
// then check if ptr.next val is equal to val or not if yes than make ptr.next = ptr.next.next (jumping the next node as its value if val)
// and if not than move forward
public class RemoveLinkedListElements {
    public static void main(String[] args){
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(6);
        head.next.next.next = new LinkedList(6);
        head.next.next.next.next = new LinkedList(6 );
        head.next.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next.next = new LinkedList(7);

        LinkedList nnew = removeElement(head,6);
        LinkedList ptr = nnew;
        while(ptr != null){
            System.out.println(ptr.val);
            ptr = ptr.next;
        }

    }
    static LinkedList removeElement(LinkedList head, int val){
        if(head == null)
            return null;
        while(head != null && head.val == val ){
            head = head.next;
        }
        LinkedList ptr = head;

        while(ptr!=null){
          if(ptr.val == val)
              ptr = ptr.next;

            if(ptr.next!=null && ptr.next.val == val){
                ptr.next = ptr.next.next;
            }
            else{
                ptr =  ptr.next;
            }
        }
        return head;
    }
}
