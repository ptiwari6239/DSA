

# LEETCODE QUESTION :- 1539
class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        lo = 0
        hi = len(arr) - 1
        while(lo <= hi):
            mid = lo + (hi - lo) // 2
            missing = arr[mid] - (mid + 1)  
            if missing >= k:
                hi = mid - 1
            else:
                lo = mid + 1
        return hi + k + 1