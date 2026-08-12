class Solution:
    def maxArea(self, heights: List[int]) -> int:
        '''
        L = , R = len(height)-1
        max_vol = 0
        while(L<R):
            max_vol = max ( max_vol,min(height[L],height[R]) * R-L)
            move the pointer which has the min amoung L and R
        return the max volumne

        '''
        L , R = 0, len(heights)-1
        
        max_vol = 0
        while(L<R):
            max_vol = max(max_vol, min(heights[L], heights[R])* (R-L))
            if(heights[L]<=heights[R]):
                L+=1
            else:
                R-=1

        return max_vol
