class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        
        result = []
        state = []
        candidates.sort()
        def dfs(i,remaining):
            nonlocal result, state
            #breaking condition
            if(remaining == 0):
                result.append(state.copy())
                return
            if(i>=len(candidates) or remaining <0):
                return
            
            # take element i
            state.append(candidates[i])
            dfs(i+1,remaining-candidates[i])
            # dont take element i
            while (i+1<len(candidates) and candidates[i] == candidates[i+1]):
                i+=1
            state.pop()
            dfs(i+1, remaining)
        
        dfs(0,target)
        return result