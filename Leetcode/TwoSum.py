

# leetcode question :- 1

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        newArr = []
        for i in range(len(nums)-1):
            j = i + 1
            for p in range(j,len(nums)):
                if nums[i] + nums[p] == target:
                    newArr.append(i)
                    newArr.append(p)
                    return newArr