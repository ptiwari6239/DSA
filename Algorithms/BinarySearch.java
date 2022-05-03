public class BinarySearch {
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1 ;
        while (end >= start) {
            int mid;
//          mid = (start+end)/2 can give error if the are numbers  large:
            mid = start + (end - start) / 2;
            if (arr[mid] > target){
                end = mid - 1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
    return -1;
    }
    public static void main(String[] args){
        int[] array = {-4,-3,-2,-1,0,2,4,6,7,8,91,911};
        int target = -2;
        int ans = BinarySearch(array,target);
        System.out.println(ans);
    }
}
