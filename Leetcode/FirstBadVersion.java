//// leetcode question :- 278
//public class FirstBadVersion {
//    public int firstBadVersion(int n) {
//        int left = 1, right = n, ans = -1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)) {
//                ans = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return ans;
//    }
//}
