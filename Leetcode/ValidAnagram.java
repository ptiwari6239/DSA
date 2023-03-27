
// leetcode question :- 242 https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public static void main(String[] args){

    }
    static  boolean isAnagram(String s, String t) {
        int CHAR  = 256;
        if(s.length()!=t.length())
            return false;
        int count[] = new int[CHAR];
        for(int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;

        }
        for(int i = 0 ; i < CHAR; i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}
