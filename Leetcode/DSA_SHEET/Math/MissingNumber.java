import java.util.Arrays;

// leetcode questin :- 268 https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {0,1,3};
        System.out.println(missing(arr));
    }
    // simple and brute force approch
    static int missingNumber(int[] nums){
        Arrays.sort(nums);
        int i = 0 ;
        while(i<nums.length){
            if(nums[i]!=i){
                break;
            }
            i++;
        }
        return i;


    }
    // approch 2nd
    // total sum till n - total sum of array = missing number
    static int missing(int[] nums){

    int Sum = (nums.length*(nums.length+1))/2;
    int totalsum = 0 ;
    for(int i = 0 ; i < nums.length; i++){
        totalsum += nums[i];
    }
    return Sum - totalsum;

    }


}
