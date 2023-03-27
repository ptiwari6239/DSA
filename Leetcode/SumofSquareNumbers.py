


# leetcode question :- 633

class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        left = 0
        right = int(c ** 0.5)
        while left <= right:
            res = left ** 2 + right ** 2
            if res == c:
                return True
            elif res < c:
                left += 1
            elif res > c:
                right -= 1
        return False      
            