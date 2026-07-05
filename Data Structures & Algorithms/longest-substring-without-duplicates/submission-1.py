class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        i = 0
        j = 1
        max_length = 1
        char_set = set()
        char_set.add(s[0])
        length = 1
        while(i<j and j< len(s)):
            while s[j] in char_set:
                char_set.remove(s[i])
                i = i+1
            else:
                char_set.add(s[j]) 
                length= length+1;     
                j = j+1
            max_length = max(max_length, j - i)
        return max_length

        '''
        input string s
        output: length of longest substring without duplicate
        two pointers
        start and end
        track a max_length
        start = 0 , 
        add s[start] to hashset,
        set end = 1;
        add s[end] to set, if duplicate, move the start and compare with max_length and reset end length
        and move the start, 
        try with new end, if end is not a duplicate entry increment length count.


        

        '''