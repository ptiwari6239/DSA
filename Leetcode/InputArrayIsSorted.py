# leetcode question :- 167


class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
            for i in range(len(numbers)-1):
                req = target - numbers[i]
                start,end = i+1, len(numbers) -1 
                mid = 0 
                while end>= start:
                    mid = start + (end - start)//2
                    if numbers[mid] > req:
                        end = mid - 1
                    elif numbers[mid] < req:
                        start = mid + 1
                    else: 
                        return [i+1,mid+1]
        