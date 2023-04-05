
// leetcode question:- 283  https://leetcode.com/problems/move-zeroes/
// the logic is simple whenever we encounter first  non-zero element  then it must be placed on 0th index and
// and same with the second and third and every non-element of the array;

public class MoveZeroes {
    static void main(String[] args){

    }
    static void moveZeros(int[] nums){
        int count = 0 ; // the first non-zero element must be on this index;
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i]!=0){   // we encounter an non-zero element
                int temp = nums[i];
                nums[i] = nums[count];      // swaping it
                nums[count] = temp;
                count++; // increasing it because the next non-zero element must be next element of the previous
            }

        }
    }

}
