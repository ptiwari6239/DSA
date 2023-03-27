
# leetcode question:- 367

class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        start,end  = 1, num
        while end>=start:
            mid = start + (end-start)//2
            if mid*mid == num:
                return True
            elif mid*mid > num:
                end = mid -1
            elif mid*mid < num:
                start = mid + 1
        return False       