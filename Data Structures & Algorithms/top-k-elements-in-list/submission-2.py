class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        '''
        create a min heap of size k 
        insert the freq and element as a tuple to the heap O(n) O(n.logk)
        if size is greater than k
        remove the current minimum 

        collect all elements from the min heap and return O(n)


        '''
        freq = Counter(nums)
        heap = []
        for i in freq.items():
            heapq.heappush(heap,(i[1],i[0]))
            if(len(heap)>k):
                heapq.heappop(heap)
        return [x[1] for x in heap]