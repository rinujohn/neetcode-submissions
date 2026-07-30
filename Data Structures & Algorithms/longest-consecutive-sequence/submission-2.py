class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        length_map = {}
        max_length = 0 
        for n in nums:
            if n in length_map:      # <-- skip duplicates
                continue
            left = length_map.get(n-1,0)
            right = length_map.get(n+1,0)
            length_map[n] = 1 + left + right
            length_map[n-left] = 1 + left + right
            length_map[n+right] = 1 + left + right
            if(length_map[n]> max_length):
                max_length = length_map[n]
        print(length_map)
        return max_length