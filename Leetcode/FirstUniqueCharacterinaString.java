
// leetcode question :- 387 https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterinaString {
    public static void main(String[] args){
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    static int  firstUniqChar(String s) {
        if(s.length() == 1)
            return 0;
        int CHAR = 256;
        int []count = new int[CHAR];
        for(int i = 0; i< s.length(); i++){
            count[s.charAt(i)]++;

        }
        for(int i = 0; i < s.length(); i++){
            if (count[s.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    }
