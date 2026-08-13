class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        '''

        input: points <2d array> 
        integer k
        return k closest points to the origin

        create a hashmap with distance to origin as key and value as the coordinates
        create a min heap of size k which stores distance



        '''
        
        heap = []
        #pmap ={}
        for point in points:
            distance = math.sqrt(point[0]**2 + point[1]**2)
            heapq.heappush_max(heap,(distance,point))
            if(len(heap)>k):
                heapq.heappop_max(heap)
            #pmap[distance] = point
        result = []
        for d in heap:
            result.append(d[1])

        return result