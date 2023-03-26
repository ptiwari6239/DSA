// leetcode question :- 26
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int number = nums[0];
        int indexToAdd = 1;
        int count = 1;
        for (int i = 1 ; i < nums.length; i++){
            if(nums[i] > number){
                nums[indexToAdd] = nums[i];
                indexToAdd++;
                number = nums[i];
                count++;
            }

        }

        return count;

    }
}
