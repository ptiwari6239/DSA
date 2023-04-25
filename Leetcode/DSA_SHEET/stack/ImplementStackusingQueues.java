
// leetcode :- 225 https://leetcode.com/problems/implement-stack-using-queues/

import java.util.ArrayList;

public class ImplementStackusingQueues {

    private  ArrayList<Integer> st ;
    private int Top = - 1;
    ImplementStackusingQueues(){
        st = new ArrayList<>();
    }
    void push(int x){
        Top++;
        st.add(Top,x);
    }
    int pop(){
            int res = st.get(Top);
            Top--;
            return  res;
    }
    int top(){
        return st.get(Top);
    }
    boolean empty(){
        return Top==-1;
    }
}
