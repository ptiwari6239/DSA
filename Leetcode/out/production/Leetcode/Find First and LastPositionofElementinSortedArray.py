
## leetcode question :- 34

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
            start , end = 0, len(nums) - 1 
            mid = None
            while end >= start:
                mid = start + (end-start)//2
                if nums[mid] < target:  
                    start = mid + 1
                elif nums[mid] > target:
                    end =  mid - 1                     
                else:
                    break
            if mid is None or nums[mid] != target :
                return [-1,-1]

            start = end = mid
            while start - 1 >= 0 and nums[start-1] == target: 
                start -= 1
            while end + 1 < len(nums) and nums[end+1] == target: 
                end += 1
            
            return [start, end] 
        