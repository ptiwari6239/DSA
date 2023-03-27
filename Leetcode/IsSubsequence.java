
// leetcode question :- 392      https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public static void main(String[] args){
        String s = "acb";
        String t = "ahbgdc";
//        System.out.println(result(s,t));
        System.out.println(s.charAt(2));
    }
    static boolean result(String s, String t){

        int i = 0 ;
        int j = 0 ;
        boolean Result = false;
        if(s.length()==0)
            return true;
        while(j < s.length() && i < t.length()){
            if(s.charAt(j) == t.charAt(i)){
                i++;
                j++;
                Result = true;
            }
            else{
                i++;
            Result = false;}
        }

        return Result && j == s.length();
    }
}
