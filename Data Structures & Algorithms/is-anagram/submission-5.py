class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        freqMap = [0] * 26
        
        for c in s:
            freqMap[ord(c) -ord('a')]+=1
        for c in t:
            freqMap[ord(c) -ord('a')]-=1
        if freqMap == [0]*26:
            return True
        return False
        
        