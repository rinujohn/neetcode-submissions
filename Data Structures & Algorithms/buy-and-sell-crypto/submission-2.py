class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        '''
        O(n^2) brute force appraoch:

        for i 0 to n-2:
            for j i+1 to n-1:
                track the max(prices[j]-prices[i])
    
        can we do it in O(n)
        we cannot sort
        l = 0 
        r = 0
        min = 0
        while(r<len(prices)):
            max = max(max, prices[r]-prices[l])
            if prices[r]<min:
                l = r
            r++

        mistake: we dont need a seperate l pointer,
        track the min price till r including r 
        track the max profit price[r]- min_price_Till_r
        '''
        minP = prices[0]
        maxProfit = 0
        for p in prices:
            maxProfit = max(maxProfit,p-minP)
            minP = min(minP, p)
        return maxProfit