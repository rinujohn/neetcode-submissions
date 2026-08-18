class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        '''
        input :
        s <string>
        length of longest substring without duplicate characters
        L= 0, R = 0
        add s[R] to the set
        if set contains R
        move L but 
        Apparoch 1: BF
        for all substring combinations
        maxLength = -1
        for i 1 to len(s)-2:
            for j i+1 to len(s):
                maxs = checkUnique(s[i:j])
                maxLength= max(maxs,maxLength)
        return maxs

        checkUnique(s):
            for each s in add it to set
            if len(s) == len(set):
                return len(s)
            return 0

            we are intrested only in length

        App2:

        two pointer:

        l,r=0

        add s[r] to the set
        if an add fail
        remove s[l] and increment l
        try to add s[r]
        if it still fail remove s[l] and increment l
        track the max length a lso
        O(n) runtime with O(n) space
        '''
        l,r = 0,0
        maxl = 1
        if(len(s) == 0):
            return 0
        uset = set()
        while(r<len(s)):
            while(s[r] in uset):
                uset.remove(s[l])
                l+=1
            uset.add(s[r])
            
            maxl = max(maxl,r-l+1)
            r+=1
        return maxl            
