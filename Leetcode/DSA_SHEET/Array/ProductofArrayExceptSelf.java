// leetcode question :- 238 https://leetcode.com/problems/product-of-array-except-self/

public class ProductofArrayExceptSelf {
    public static void main(String[] args){
        int[] nums = {-1,1,0,-3,3};
        int[] ans = product(nums);
        for(int i = 0 ; i <ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
//    static int[] product(int[] nums){
//        int prefix = 1;
//
//        for(int i = 0 ; i < nums.length; i++){
//            int temp = nums[i] ;                                      // this is simple but long approch
//            int suffix = 1;
//            for(int j = i+1; j < nums.length; j++){
//                suffix = suffix * nums[j];
//            }
//            nums[i] = prefix*suffix;
//            prefix = prefix*temp;
//        }
//        return nums;
//    }
    static int[] product(int[] nums){
        int[] right = new int[nums.length];
        int p1=1;
        for(int i = nums.length -1 ; i >=0 ;  i--){
            right[i] = p1;
            p1 = p1*nums[i];                          // prodoct of right side of the array for every element in array
        }
        int prefix = 1;
        for(int i = 0 ; i < nums.length; i++){
            int temp = nums[i];
            nums[i] = prefix*right[i];                 // now the result will be product of left X product of right
            prefix = prefix*temp;
        }
        return nums;
    }
}
