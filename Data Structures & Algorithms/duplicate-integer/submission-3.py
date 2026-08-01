class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        numset = set()
        for n in nums:
            numset.add(n)
        if len(nums) != len(numset):
            return True
        return False