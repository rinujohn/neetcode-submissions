class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        '''
        return all possible subsets without duplicates

        we also contains duplicate elements

        hence if the next element is also same, dont follow that route skip the element
        '''

        result = []
        state = []
        nums.sort()
        def dfs(i):
            nonlocal result,state
            # breaking condition
            if(i == len(nums)):
                result.append(state.copy())
                return
            if (i>=len(nums)):
                return
            

            #taking i
            
            state.append(nums[i])
            dfs(i+1)

            #without i
            state.pop()
            while(i+1<len(nums) and nums[i] == nums[i+1]):
                i = i+1
            dfs(i+1)
        
        dfs(0)
        return result
            #skip duplicate