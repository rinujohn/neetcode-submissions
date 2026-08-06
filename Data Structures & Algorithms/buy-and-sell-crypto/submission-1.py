class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        DP = [0]*len(prices)
        prefix_min = prices[0]

        for i in range(1, len(prices)):
            DP[i] = max(DP[i-1], prices[i]- prefix_min)
            prefix_min = min(prefix_min, prices[i])
        
        return DP[len(prices)-1]
                
    '''
    Brute force

    Take all i, j pairs
        find the max and return
    

    DP:
    subproblem:
    max profit i can make by selling today

    DP[0] = 0
    prefix min = prices[0]

    for i in range(1,len(prices)):
        dp[i] = max(dp[i-1],prices[i]-prefix_min)
        prefix_min = min(prefix_min, prices[i])
    
    return dp[len(prices)-1]

        '''
        