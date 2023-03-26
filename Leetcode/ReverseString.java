// leetcode question :- 344
public class ReverseString
{
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        char store ;
        while(low<=high){
            store = s[low];
            s[low] = s[high];
            s[high] = store;
            low++;
            high--;

        }

    }
}
