
// leetcode question :- 415 https://leetcode.com/problems/add-strings/



// have got the logic but stuck in implementation part
// first get the ascii value least significant bit and subtract it from '0'
// do this for the both string and then add them
// check for any carry
// store the lsb of the outcome to the result
// repeat till the solution
public class AddStrings {
    public static void main(String[] args){
        String s = "123";
        String s2 = "111";
        System.out.println(addString(s,s2));

    }
    static String addString(String num1, String num2){

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String result = "";
        int carry = 0;
        while(i>=0||j>=0|| carry!=0){
          int x = i>=0 ? num1.charAt(i) - '0':0;
          int y = j>=0 ? num2.charAt(j) - '0':0;
          int sum = x+y+carry;
          result = sum%10+result;
          carry =sum/10; // last digit of sum is our carry
          i--;
          j--;
        }
        return result;
    }
}
