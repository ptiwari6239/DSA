
# leetcode question :- 349
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        def swap(ar, a, b):
            ar[a], ar[b] = ar[b], ar[a]
            return ar


        def InsertionSort(arr):
            for i in range(len(arr)-1):
                j = i + 1
                while j > 0 and arr[j] < arr[j-1]:
                    swap(arr, j, (j-1))
                    j = j - 1

            return arr
       
        
        arr = [] 
        for i in range(len(nums1)):
            for j in range(len(nums2)):
                if nums1[i] == nums2[j]:
                    arr.append(nums1[i]) 
        arr = list(dict.fromkeys(arr))
        return arr