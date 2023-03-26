// leetocde question :- 35
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length - 1;
        int mid = 0 ;

        while(end>=start){
            if(target<nums[0]){
                mid = 0;
                break;}
            else if(target>nums[end]){
                mid = end + 1;
                break;
            }
            mid = start + (end - start)/2;
            if(nums[mid]== target || nums[mid]>target && nums[mid-1] <target){
                break;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else if (nums[mid]<target){
                start = mid + 1;
            }



        }
        return mid ;

    }
}
