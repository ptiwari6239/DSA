
// leetcode question :-1822
public class SignoftheProductofanArray {
    public int arraySign(int[] nums) {
        int count = 0;
        for(int x : nums){
            if(x==0)
                return 0;
            if(x < 0)
                count++;
        }
        if(count %2 == 0)
            return 1;
        return -1;
    }
}
