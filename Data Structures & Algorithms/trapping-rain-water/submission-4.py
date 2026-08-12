class Solution:
    def trap(self, height: List[int]) -> int:
        m = 0
        maxL = [0]* len(height)
        for i in range(0,len(height)):
            maxL[i]  = m
            m = max(m,height[i])
        #print(maxL) 

        m = 0
        maxR = [0]* len(height)
        for i in range(len(height)-1,-1,-1):
            maxR[i]  = m
            m = max(m,height[i])
        #print(maxR)   
        sum = 0
        for i in range(len(height)):
            w = min(maxR[i],maxL[i]) - height[i]
            if w > 0:
                sum +=w

        return sum
        '''
        two pointer

        leftMax =0 , rightMax = 0
        L= 0 , R = 0
        iterate through the array
        and find the leftMax and rightMax for each position

        height  = 0 2 0 3 1 0 1
        leftMax = 0 0 2 2 3 3 3
    
        rightMax= 3 3 3 1 1 1 0
        cumSum  = 0 2 0 5 6 6 1

        for each position:
            water = min(leftMax[pos], rightMax[pos])- height
            if it is negative ignore 



        '''