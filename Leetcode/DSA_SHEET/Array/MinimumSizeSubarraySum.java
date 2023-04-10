
// leetcode question:- 209 https://leetcode.com/problems/minimum-size-subarray-sum/
// logic :- simple sliding window
// first add the number on the right index to the sum
// if the sum is equal or greater than the target than keep removing the numbers from left index while keeping the record of the each minimum length
public class MinimumSizeSubarraySum {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,1,1,1,1};
        System.out.println(minSub(arr,11));
    }
    static int minSub(int[] nums,int target){
        int min = Integer.MAX_VALUE;
        int sum = 0 ;
        int left = 0 ;
        for(int right = 0 ; right < nums.length; right++){
          sum+=nums[right];
          if(sum>=target){
              while(sum>=target){
                  min = Math.min(min,right-left+1);
                  sum-=nums[left];
                  left++;
              }
          }
        }
        if(min == Integer.MAX_VALUE)
            return 0;
        return min;
    }
}
