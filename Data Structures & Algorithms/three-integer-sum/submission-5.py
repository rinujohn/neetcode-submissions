class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ''' 
        integer array
        find all elements whos element sum is zero

        Brute Force approach

        consider all three pairs

        for i 0 to n-3
            for j : i to n-2
                for k : j to n-1
                    add all pairs to result with nums[i]+ nums[j] +nums[k] == 0
        runtime: O(n^3)

        Approach 2:
        sort the array

        for target in nums:
            run the 2 sum method with target

            
        nlogn + O(n^2) = O(n^2)       
        '''
        def twoSum(target,numList):
            result = set()
            L = 0
            R= len(numList)-1
            while(L<R):
                if(numList[L]+numList[R] == target):
                    result.add(tuple(sorted((-target,numList[L],numList[R]))))
                    L+=1
                    R-=1
                elif ((numList[L]+numList[R] < target)):
                    L+=1
                else: 
                    R-=1
            return result
        nums.sort()
        print(nums)
        result = set()
        #print(twoSum(-nums[0], nums[1:]))
        for i in range(len(nums)-2):
            # print(nums[i])
            # print(nums[0:i]+nums[i+1:])
            result.update(twoSum(-nums[i], nums[0:i]+nums[i+1:]))
        #print(result)
        return [list(x) for x in result]
