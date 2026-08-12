class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.heap = []
        self.k = k
        for i in nums:
            heapq.heappush(self.heap,i)
        while(len(self.heap)>k):
            heapq.heappop(self.heap)

    def add(self, val: int) -> int:
        
        '''
        create min heap based on nums 
        while size of min heap greater than k poll 

        for each add operation

        add element to min heap, if healp size is greater than k poll
        return the peek element as answer

        '''
        heapq.heappush(self.heap,val)
        if(len(self.heap)>self.k):
            heapq.heappop(self.heap)
        return self.heap[0]
