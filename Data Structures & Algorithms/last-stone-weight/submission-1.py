class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        '''
        input : stones array

        for each step : select two heavy stone
            if x == y, remove both
            else smaller weight distroied , larger one weight updated to y-x
        repeat this process till only one stone remains

        '''

        heapq.heapify_max(stones)
        while(len(stones)>1):
            x = heapq.heappop_max(stones)
            y = heapq.heappop_max(stones)
            if(x==y):
                continue
            else:
                z = abs(x-y)
                heapq.heappush_max(stones,z)
            print(stones)
        if len(stones) == 0:
            return 0
        return stones[0]