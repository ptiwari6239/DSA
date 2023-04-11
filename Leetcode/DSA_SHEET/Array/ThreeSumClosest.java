import java.util.Collection;
import static java.lang.Math.abs;
import java.util.*;
// https://leetcode.com/problems/3sum-closest/
// leetcode question:- 16
public class ThreeSumClosest {
    public static void main(String[] args){
        int[] arr = {-1,2,1,-4};
        System.out.println(ClosestSum(arr,1));
    }
    static int  ClosestSum(int[] nums, int target){
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            int ptr1 = i+1;
            int ptr2 = nums.length-1;
            while(ptr1<ptr2){
                int sum = nums[i] + nums[ptr1] + nums[ptr2];
                if(abs(target-sum)<abs(target-min))
                    min = sum;
                if(sum > target)
                    ptr2--;
                else
                    ptr1++;
            }
        }

        if(min==Integer.MAX_VALUE)
            return 0;
        return min;
    }

}
