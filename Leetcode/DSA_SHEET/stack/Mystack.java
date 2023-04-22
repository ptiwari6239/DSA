public class Mystack {
    int cap;
    private int[] arr;
  private   int top = -1 ;
    Mystack(int capacity){
         cap = capacity;
        arr = new int[cap];
    }
    void push(int x){
        top++;
        if(top>cap-1)
            System.out.println("*****overflow*****");
        else arr[top] = x ;
    }
    int pop(){
        if(top<0){

            System.out.println("**underflow***");
            return -1;
        }
        int res = arr[top];
        top--;
        return  res;
    }
    void peek(){
        System.out.println(arr[top]);
    }
    boolean isEmpty(){
        return top < 0;
    }
    int size(){
        return top+1;
    }



}
