class Solution:
    def findMin(self, nums: List[int]) -> int:
        L=0
        R= len(nums)-1

        #mid = (L+R)//2

        while(L<R):
            mid = (L+R)//2
            # if R-L+1 == 1:
            #     return nums[mid]
             
            if(nums[mid]<nums[R]):
                R = mid
            else:
                L= mid+1
            
        return nums[L] # mistake 1: return L, not the mid
        

        '''
find minimum in a rotated array

L = 0, R= n-1

mid = (L+R)/2

while(L<R):
    if R-L+1 == 1 :
        return mid

    invariant: if nums[mid]< nums[R]:
        select left half including the mid
        else:s select right excluding the mid
        '''