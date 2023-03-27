# leetcode question :- 153

class Solution:
    def findMin(self, nums: List[int]) -> int:
        i = 0 
        MinValue = nums[i]
        while i < len(nums):
            if nums[i] < MinValue:
                MinValue = nums[i]
                i +=1
            i +=1
        return MinValue   
        