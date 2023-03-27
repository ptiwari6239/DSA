
# leetcode question :- 374

# The guess API is already defined for you.
# @param num, your guess
# @return -1 if num is higher than the picked number
#          1 if num is lower than the picked number
#          otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        start,end = 1,n
        
        while end>=start:
            mid = (start+end)//2
            x = guess(mid)
            if x==0:
                return mid 
            
            elif x<1:
                end = mid - 1
            elif x>0:
                start = mid + 1
                