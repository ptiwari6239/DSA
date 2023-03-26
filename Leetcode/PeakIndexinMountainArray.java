
// leetcode question :- 852
public class PeakIndexinMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int start = 0, end = A.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < A[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
