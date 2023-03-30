
// leetcode question :- 680 https://leetcode.com/problems/valid-palindrome-ii/

// the logic is simple only when we encounter first different characters ,  we know that
// either we should remove ith character (from the left side ) or jth charcter(from the right side)
// only after removing only one character (i or j ) rest will be palindrone again
// for example :- edeeee or eeeede
// we will not remove any character , we will just  ignore the different charcter , and check for the palindrone for
// the rest of characters

public class ValidPalindromeII {
    public static void main(String[] args){
        String s = "abc";
        System.out.println(ValidPalindrome(s));
    }
    static boolean ValidPalindrome(String s){
        int i = 0 ;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return search_inside(s,i,j-1) || search_inside(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean search_inside(String s, int i , int j ){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }

}
