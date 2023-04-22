
// leetcode question:- 155 https://leetcode.com/problems/min-stack/
// logic is simple :- keep another stack , push only those element in the stack which are less than its top element
// and when poping the element check if the regular array and minarray has some element or not
// if yes then pop from both the stack
// if not then pop from regular stack
import java.util.ArrayList;

public class MinStack {
    private ArrayList<Integer> arr;
    private ArrayList<Integer> minarr;

    private   int Top = -1 ;
    private   int minTop =0  ;
    MinStack(){

        arr = new ArrayList<Integer>();
        minarr = new ArrayList<Integer>();
        minarr.add(0,Integer.MAX_VALUE);
    }
    void push(int x){
        Top++;

       arr.add(Top,x);
       if(x<=minarr.get(minTop))
       {
           minarr.add(minTop+1,x);
           minTop++;
       }
    }
    void pop(){
        if(arr.get(Top).equals(minarr.get(minTop))){
            minTop--;
        }
        Top--;
    }
    int top(){
       return arr.get(Top);
    }
    int getMin(){
        return minarr.get(minTop);
    }


}
