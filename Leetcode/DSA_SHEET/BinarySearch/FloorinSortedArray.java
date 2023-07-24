// gfg question :- https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
public class FloorinSortedArray {
        public static void main(String[] args){
        int[] arr = {4,5,6,7,1,2,3};
            System.out.println(minNumber(arr));
        }
        static int minNumber(int[] nums){
            int low = 0;
            int high = nums.length - 1 ;
          while(low < high){
              int mid  = low+(high-low)/2;
              if(nums[mid] > nums[mid-1])
                low = mid;
              if(nums[mid]<nums[mid-1])
                  high = mid+1;
              }
            return low;
        }
        }

