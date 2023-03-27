# leetcode question :- 1351


class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
            count = 0
            for i in range(len(grid)):
                if len(grid[i]) == 0:
                    break
                elif len(grid[i]) ==1:
                    if grid[i][0] < 0:
                        count +=1
                else:
                        start,end = 1,len(grid[i]) - 1
                        mid = None
                        while end>=start:
                            mid = start + (end - start)//2
                            if grid[i][mid] < 0:
                                count += 1
                            if grid[i][mid] > 0 or grid[i][mid] == 0:
                                start = mid + 1

                            else:
                                break    

                        start = end = mid 
                        while start -1 >=0   and grid[i][start-1] < 0:
                            count +=1
                            start -=1
                        while  end + 1 <len(grid[i]) and grid[i][end+1] < 0 :
                            count +=1 
                            end +=1
           
            return count