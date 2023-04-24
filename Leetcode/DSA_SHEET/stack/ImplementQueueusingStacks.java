import java.util.ArrayList;

// leetcode question :- 232 https://leetcode.com/problems/implement-queue-using-stacks/
//
public class ImplementQueueusingStacks {
   private int top = - 1;
    private  int front = 0 ;
    ArrayList<Integer> arr ;
    ImplementQueueusingStacks(){
        arr = new ArrayList<>();
    }
    void push(int x){
        top++;
        arr.add(top,x);

    }
    int pop(){
        int rest = arr.get(front);
        front++;
        return  rest;
    }
    int peek(){
        return arr.get(front);
    }
    boolean empty(){
        return front>top;
    }

}
