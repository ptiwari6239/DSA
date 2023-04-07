import java.util.HashMap;

// leetcode question :- 560 https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsK {
    public static void main(String[] args){
            int[] array = {-1,-1,1};
        System.out.println(subarray(array,0));
    }
    static int subarray(int[] nums, int k ){
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0 ;i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k))
                ans+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
