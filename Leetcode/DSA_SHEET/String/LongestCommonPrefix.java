
// leetcode question on string :- 14 https://leetcode.com/problems/longest-common-prefix/

// edge case :- when there is only one element in the array :- if the length of the array is 1 then return the whole string
// and for the normal case
// starting with only 1st two elements check upto which element they have common character
// and then check for next 2 elements
// if there is no common character in any element in the starting then return ""
// otherwise return the character upto which they are common
public class LongestCommonPrefix {
    public static void main(String[] args){
        String []strs  = {"flower"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs){

       if(strs.length == 0)
           return "";
       String prefix = strs[0]; // let whole first element be the prefix
       for(int i = 1 ; i < strs.length ; i++){
           while(strs[i].indexOf(prefix)!=0){  // if the second element and prefix are match it will return 0
                                                // check till both the element are (prefix and next element are common or not
                prefix = prefix.substring(0,prefix.length() -1 ); // crop till the prefix match the next element
                if(prefix.isEmpty()) // if next element and prefix does not match , in this case return ""
                    return "";
           }

       }
       return prefix;
    }
}
