
## leetcode question :- 852

class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        start = 0
        end = len(arr) - 1
        mid = 0
        while end >=start:  
            mid = start + (end-start)//2
            if  arr[mid+1] < arr[mid] > arr[mid-1] :
                return mid
            elif arr[mid] < arr[mid + 1]:
                start = mid + 1
            else:
                end = mid 
                