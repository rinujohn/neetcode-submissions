class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
    
        min_length = len(nums)+5
        L = 0
        R = 0
        sum = 0
        while(R< len(nums)):
            sum = sum+nums[R]

            while(sum >= target and L<=R):
                min_length = min(min_length, R-L+1)
                #print(nums[L:R+1])
                sum -=nums[L]
                L+=1

            R+=1
        if(min_length ==len(nums)+5):
            return 0
        else:
            return min_length

    '''
input: 
array of positive integers : nums
positive intger target

return minimal length of subarray whose sum is greater than or equal to target
no such subarray return 0

initialize L, R =0
sum = 0
min_length = -1
while(R< len(nums)):
    sum = sum + nums[R]
    while(sum >=target):
        min(min_length, (R-L)+1)
        L++

    R++
if(min_length == -1):
    return 0
else return min_length

    '''