class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        '''
        maintain a min heap of size k
        '''
        heap = []
        for i in nums:
            heapq.heappush(heap,i)
            if(len(heap)>k):
                heapq.heappop(heap)
        return heapq.heappop(heap)