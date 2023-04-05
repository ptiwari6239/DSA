
// leetcode question :- 724 https://leetcode.com/problems/find-pivot-index/
// this is question is based on prefix sum techinquie



public class FindPivotIndex {
    public static void main(String[] args){
        int[] arr = {-5,1,5,0,-7} ;
//        int[] answe = ans(arr);
//        System.out.println(ans(arr));

    }
    static int pivotIndex(int[] nums){
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }



}
