class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        def backtrack(start, state):
            nonlocal result
            #if state not in result:   #O(n)
            result.append(state.copy())
            for i in range (start, len(nums)): #O(n)
                state.append(nums[i])
                backtrack(i+1,state) #O(n)
                state.pop()
        backtrack(0,[])
        return result

            