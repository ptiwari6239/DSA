import java.util.Stack;

// leetcode question :- 844 https://leetcode.com/problems/backspace-string-compare/
// logic :- push every character into stack and pop if upcoming character is "#"
public class BackspaceStringCompare {
    public static void main(String[] args){
        String s = "bxj##tw";
        String t = "bxj###tw";
        System.out.println(backspacecompare(s,t));
    }
    static boolean backspacecompare(String s, String t){

        Stack<Character> sstack = new Stack<>();  // create a stack for first string
        Stack<Character> tstack = new Stack<>(); // stack for second string
        for(int i = 0 ; i < s.length(); i++ ){
            if(sstack.isEmpty() && s.charAt(i)=='#')     // if stack is empty and upcoming character is "#" do nothing
                continue;
            if(s.charAt(i)=='#')        // is encounter "#" then pop()
                sstack.pop();
            else sstack.push(s.charAt(i)); // else push the upcoming character
        }
        for(int i = 0 ; i < t.length(); i++){
            if(tstack.isEmpty() && t.charAt(i)=='#')
                continue;
            if(t.charAt(i)=='#')
                tstack.pop();
            else tstack.push(t.charAt(i));
        }
        if(sstack.size()!=tstack.size())        // if the size of both is not same it means they are not equal
            return false;
        while(!sstack.isEmpty()){
            if(sstack.peek().equals(tstack.peek())){  //  if top of both the stack is same then pop both of the stack
                sstack.pop();
                tstack.pop();
            }
            else return false;  // else they are not same then return false;
        }
        return true;
    }
}
