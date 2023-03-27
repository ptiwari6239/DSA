# leetcode question :- 9


class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev = str(x)
        if rev[::-1] == str(x):
            return True 
        else :
            False