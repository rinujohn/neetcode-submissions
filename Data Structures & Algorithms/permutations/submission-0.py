class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        '''
        input:
        nums <array of unique integers>
        return all permutation of answers

        in permutation order matters

        we need to pick all three elements

        for each positon 
        n choice
        n-1 choice and so on

        [1] [2] [3]
        [1,2] [1,3]  2,1 2,3 3,1 3,2
        1,2,3 1,3,2 2,1,3 2,3,1 3,1,2 3,2,1

        we are collecting the last branch

        if we take one element we need to consider remaining for the path
        state ,result = []
        used = set()
        def dfs(i):

            breaking condition:
            state length is len(nums) 
            append state to result and return

            state.append(nums[i])
            dfs()
            state.pop()
            used.pop(nums[i])
        '''
        result = []
        state = []
        used = set()

        def dfs():
            nonlocal result, state, used
            if(len(state)== len(nums)):
                result.append(state.copy())
                return
            # if(i>=len(nums)):
            #     return
            for x in nums:
                if x not in used:
                    state.append(x)
                    used.add(x)
                    dfs()
                    state.pop()
                    used.remove(x)
        dfs()
        return result
            