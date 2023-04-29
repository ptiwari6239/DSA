import java.util.Stack;

// leetcode question:- 150  https://leetcode.com/problems/evaluate-reverse-polish-notation/
// the logic is simple :- if the tokens's element is any arthematic symbol then just pop the
// last two elements and do the calculation accordingly and push the result to the stack
// and if not the symbol
// then just push it to the stack
// remember to return the top of the stack is case if the only one numberical value is pushed to the stack
public class EvaluateReversePolishNotation {
        public static void main(String[] args){
            String[] arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
            System.out.println(evalRPN(arr));
        }
        static int evalRPN(String[] tokens){
            int res = 0 ;
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i<tokens.length; i++){
                if("/".equalsIgnoreCase(tokens[i]) || "+".equalsIgnoreCase(tokens[i]) || "-".equalsIgnoreCase(tokens[i]) || "*".equalsIgnoreCase(tokens[i]) )
                {
                    int a = st.pop();
                    int b = st.pop();
                    if("/".equalsIgnoreCase(tokens[i])){
                        res = b/a;
                        st.push(res);
                    }else if ("+".equalsIgnoreCase(tokens[i])){
                        res = a+b;
                        st.push(res);
                    }
                    else if ("-".equalsIgnoreCase(tokens[i])){
                        res = b-a;
                        st.push(res);
                    }
                    else if("*".equalsIgnoreCase(tokens[i])){
                        res = a*b;
                        st.push(res);
                    }
                }
                else{
                    st.push(Integer.parseInt(tokens[i]));
                }
            }
            return st.pop(); //  return the top of the stack and not res and it stack can be only one numher
        }
}
