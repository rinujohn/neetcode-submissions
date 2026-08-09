class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        cCount = Counter(chars)
        result = 0
        for s in words:
            
            if Counter(s)<=cCount: 
                
                result+=len(s)
        return result
