class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        freq_map = {}
        max_freq = 0
        l = 0
        result = 0

        for r in range(len(s)):
            freq_map[s[r]] = 1 + freq_map.get(s[r],0)
            max_freq = max(max_freq,freq_map[s[r]])
            #cost = r-l+1 - max_freq

            while(r-l+1 - max_freq > k):
                freq_map[s[l]] -= 1
                l +=1
            result = max(result, r-l+1)
        return result