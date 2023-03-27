
# leetcode question :- 278

# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        start,end = 1,n
        
        while end>= start:
            mid = start + (end - start)//2
            if isBadVersion(mid) and isBadVersion(mid-1):
                end = mid-1
            elif isBadVersion(mid) ==1  and isBadVersion(mid-1) ==0:
                return mid
            else:
                start = mid+1
           