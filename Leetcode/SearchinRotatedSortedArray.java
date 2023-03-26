
// leetcode question :- 33
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int ans = answer(nums,target);
        return ans;

    }
    int findpivote(int[] numbs)
    {
        int start = 0;
        int end = numbs.length -1 ;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if (mid < end && numbs[mid] > numbs[mid+1])
            {
                return mid;

            }
            if(mid > start && numbs[mid] < numbs[mid-1])
            {
                return mid-1;

            }

            if(numbs[mid]<=numbs[start])
            {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }


        }
        return -1;
    }
    int search(int[] nums,int number,int low,int end)
    {
        while(low<=end)
        {
            int mid = low + (end-low)/2;
            if(nums[mid] > number)
            {
                end = mid-1;

            }
            else if (nums[mid] < number)
            {
                low = mid+ 1;

            }
            else
            {
                return mid;
            }




        }
        return -1;
    }
    int answer(int[] nums,int target)
    {
        int pivote = findpivote(nums);
        if(pivote == - 1)
        {
            return search(nums,target,0,nums.length -1);
        }
        if (nums[pivote] == target){
            return pivote;
        }
        if (target>=nums[0])
        {
            return search(nums,target,0,pivote -1);
        }
        return search(nums,target,pivote+1,nums.length-1);
    }

}
