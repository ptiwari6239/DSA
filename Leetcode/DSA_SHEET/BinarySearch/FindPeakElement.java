
// leetcode question:- 162  https://leetcode.com/problems/find-peak-element/
//
public class FindPeakElement {
    public static void main(String[] args){
        int[] arr = {1,2,7,3,5,6,4};
        System.out.println(findPeack(arr));
    }
    static int findPeack(int[] nums){
        int low = 0 ;
        int high = nums.length - 1;
        while(low<high){
            int mid  = low+(high-low)/2;
            if(nums[mid]<nums[mid+1]) {
                low = mid+1;
            }
            else
                high = mid;

        }
        return low;
    }
}
