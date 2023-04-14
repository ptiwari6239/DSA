
// leetcode question:- 1004 https://leetcode.com/problems/max-consecutive-ones-iii/
// this question is based on sliding window and prefix sum

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
//        System.out.println(longesOnes(nums,2));
    }

    static int longone(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int ans = 0;
        int count = 0;
        while (j < nums.length) {
            if (nums[j] == 0)
                count++;
            while (count > k) {
                if (nums[i] == 0)
                    count--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);


        }
        return ans;
    }
}



