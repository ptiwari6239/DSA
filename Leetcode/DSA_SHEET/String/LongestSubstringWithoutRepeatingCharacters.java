import java.util.HashSet;
import java.util.Set;


// leetcode quesiton:- 3 https://leetcode.com/problems/longest-substring-without-repeating-characters/
// logic : sliding window
// taking each character in the string and then checking if already present in the hashset or not
// if no then adding it in the hashset and then increasing the maxlenth
// if the character is already in the hashset and removing the ith (from the left ) character from the hashset and increasing
// the ith ( to one character)

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){

    }
    static int lengthOfLongest(String s){
        int max = 0 ;
        int j = 0;
        Set<Character> set=new HashSet<>();
        for (int i = 0 ; i < s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max,i-j+1);
            }
            else{
                while(s.charAt(j)!=s.charAt(i)){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.remove(s.charAt(j));
                j++;
                set.add(s.charAt(i));
            }


        }


        return max;
    }
}
