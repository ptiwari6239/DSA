

# leetcode question :- 66

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        total = ""
        for i in range(len(digits)):
            total = total + str(digits[i])
        sum = int(total) + 1
        nwarr = []
        for p in str(sum):
            p = int(p)
            nwarr.append(p)
        return nwarr
        
        