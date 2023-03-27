
# leetcode question :- 628

class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        l = len(nums)
        return max(nums[0]*nums[1]*nums[2], nums[0]*nums[l-1]*nums[l-2])