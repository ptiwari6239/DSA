
// leetcode question :- 75 https://leetcode.com/problems/sort-colors/
// the logic is based on dutch national flag algorithm
// we keep three pointer (low , mid, and high)
// firstly low and mid will be on first index and high will be on last index
// moving from the left to right if the mid(th) is 0 than swap with the low index and increament low
// and if mid index is 2 then swap with the high and decreament high
// and keep increasing the mid index
// and also if the mid index is 1 and simply increase the mid index
public class SortColors {
    public static void main(String[] args){
        int[] arr = {2,0,1};
        SortCol(arr);
        for(int i = 0 ; i< arr.length ; i++)
            System.out.println(arr[i]);
    }
    static void SortCol(int[] nums){
        int low =  0 ;
        int high = nums.length -1 ;
        int mid = 0 ;
        while(mid<=high){

            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
            }
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else mid++;

        }
    }
    static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
   }
}
