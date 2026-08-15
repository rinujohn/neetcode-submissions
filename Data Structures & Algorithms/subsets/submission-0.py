class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        def backtrack(start, state):
            nonlocal result
            if state not in result:
                result.append(state.copy())
            for i in range (start, len(nums)):
                state.append(nums[i])
                backtrack(i+1,state)
                state.pop()
        backtrack(0,[])
        return result

            