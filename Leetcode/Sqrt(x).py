
# leetcode question :- 69

class Solution:
    def mySqrt(self, x: int) -> int:
        start , end = 1, x
        if x == 0 :
            return 0 
        else:
            while end >=start:
                mid = start + (end - start)//2
                if mid*mid == x:
                    return mid 
                elif mid*mid < x and (mid+1)*(mid+1) > x:
                    return mid 
                elif mid*mid > x:
                    end = mid -1 
                elif mid*mid < x:
                    start = mid + 1

        