class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        '''
        input: 
        nums <array of int>
        target <int>

        return a list of all unique combinations of nums
        where their sum is target

        same number can be chosen multiple time

        combination with replacement
        two combination are same if their freq of elements are same


        []
        [2] []
        [2,5] [2] [5] []

        this operation is without replacement 

        []
        [2] []
        [2,2] [2] [2] []
        what is the breaking condition
        random selection, ignore the path if the sum > target
        if sum reached target add it to the result
        how many such combinations: 
    

    Algorithm:
    sort the nums array

    result = []
    state = []
    dfs(i, remaining):
        nonlocal result and state
        #breaking condition
        if remaining< nums[i]:
            return
        if remaining == 0:
            result.append(state)
        
        state.append(nums[i])
        reamining = remaining-nums[i]
        dfs(i,reamining)
        state.pop(nums[i])
        reamining = remaining+nums[i]
        dfs(i+1,reamining)

        '''
        result = []
        state = []
        nums.sort()
        def dfs(i, remaining):
            nonlocal result, state
            if(remaining ==0):
                result.append(state.copy())
                return
            if(remaining<0 or i>len(nums)-1):
                return
            
            #take i

            state.append(nums[i])
            dfs(i, remaining-nums[i])
            state.pop()
            dfs(i+1, remaining)

        dfs(0,target)
        return result

