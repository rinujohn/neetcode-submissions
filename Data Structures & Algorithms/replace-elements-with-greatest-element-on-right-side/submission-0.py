class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        
        output = [-1] * len(arr)
        idx = len(arr)-1
        maxv = -1
        while (idx>0):
            #print(arr[idx])
            maxv = max(arr[idx],maxv)
            #print(maxv)
            output[idx-1] = maxv
            idx-=1
        #print(output)
        return output