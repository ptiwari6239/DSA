
// leetcode question:- 1004 https://leetcode.com/problems/max-consecutive-ones-iii/
// this question is based on sliding window and prefix sum

public class MaxConsecutiveOnesIII {
    public static void main(String[] args){
    }
     static int longesOnes(int[] nums, int k ){
        int i = 0 ;
        int j = 0 ;
        int ans = 0 ;
        int count = 0 ;
        while(j<nums.length){
            if(nums[j]==0)       // move forward
                count++;
            while(count>k){
                if(nums[i]==0)   // i is the pointer to the zero which is to be removed
                    count--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
     }

}
