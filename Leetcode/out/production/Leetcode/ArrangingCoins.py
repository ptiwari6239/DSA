
#leetcode question :- 441
class Solution:
    def arrangeCoins(self, n: int) -> int:
       
        coins = 0 
        rows = 0
        while rows<=n or  rows > n:
            rows = rows + 1
            coins = rows 
            n = n - coins
            if n <0:
                return rows-1
                break
            if n == 0:
                return rows
                break
    
    
