class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        '''
        given input is sorted in ascending order 
        we can use two pointer approach

        L = 0, R = len(numbers)-1

        while(L<R): 
            sum = numbers[L] + numbers[R]
        if sum == target:
            return [L,R]
        elif (sum< target):
            move L pointer L++
            since sum is less we need to increase the sum by moving the lower pointer
        else:
            move R pointer R --
the loop will terminate give there is exactly one valid solution
        '''
        L = 0
        R = len(numbers)-1

        while(L<R):
            sum = numbers[L] + numbers[R]
            if sum == target:
                return [L+1,R+1]
            elif sum< target:
                L+=1
            else:
                R-=1
            