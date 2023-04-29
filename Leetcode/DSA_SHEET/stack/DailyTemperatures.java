import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// leetcode 739  https://leetcode.com/problems/daily-temperatures/
//
public class DailyTemperatures {
    public static void main(String[] args){
        int[] arr = {30,40,50,60};
        System.out.println(Arrays.toString(dailyTemperature(arr)));
    }
    static int[] dailyTemperature(int[] arr){
        int[] answer = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length -1 ; i >=0 ; i--){
            if(st.empty()){
                st.push(i);
                answer[i] = 0 ;
            }
            else{
                while(!st.empty() && arr[i] >= arr[st.peek()]){
                    st.pop();
                }
                if(st.empty()){
                    st.push(i);
                    answer[i] = 0 ;
                }
                else{
                    answer[i] = st.peek() - i;
                    st.push(i);
                }

            }
        }
        return answer ;
    }
}
