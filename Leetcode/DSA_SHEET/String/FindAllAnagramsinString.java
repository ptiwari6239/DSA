//
//// leetcode question :- 438 https://leetcode.com/problems/find-all-anagrams-in-a-string/
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FindAllAnagramsinString {
//    public static void main(String[] args){
//
//    }
//    static List<Integer> findAnagrams(String s , String p){
//        List<Integer> as = new ArrayList<>();
//        if(s.length() < p.length())
//            return as;
//        int[] charfre = new int[26];
//        for(int i = 0 ; i < p.length();i++){
//            charfre[p.charAt(i)-'a']++;
//        }
//
//
//
//        return as;
//    }
//
//}
