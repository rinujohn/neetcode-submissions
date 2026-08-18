class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        '''
        variable sliding window

        l,r = 0
        move l pointer when (r-l+1-maxFreq)>k
        maxFreq of a single character within [l:r+1]
        maxFreq will become stale in the freq counter after moving l
        but we are looking for better solution, the next optimal length 
        and maxFreq will be greater than the current

        Algorithm:

        l, r = 0
        maxFreq = 0
        freq = [0]*26
        while(r<len(s)):
            freq[ord(s[r])-ord['A']]+=1
            maxFreq = max(maxFreq, freq[ord(s[r])])

            if(r-l+1 - maxFreq>k):
                freq[ord(s[l])]-=1
                l+=1
            max_len = max(max_len,r-l+1)
                


            r++


        '''
        l,r = 0,0
        maxFreq = 0
        max_len = 0
        freq = [0]*26
        while(r<len(s)):
            freq[ord(s[r])-ord('A')]+=1
            maxFreq = max(maxFreq, freq[ord(s[r])-ord('A')])

            if(r-l+1 - maxFreq>k):
                freq[ord(s[l])-ord('A')]-=1
                l+=1
            max_len = max(max_len,r-l+1)
            r+=1
        return max_len