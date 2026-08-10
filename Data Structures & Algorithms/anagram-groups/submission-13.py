class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        

        '''
        initialize a defaultdict with list object
        sort each string
        add it the sorted version as key and append the string to the value list

        run time :
        m len(strs)

        n : length longest string in strs

         m*nlogn
        amortized runtime for addition: O(m)

        runtime to extract the strings 
        O(m)
        total runtime : m*nO(logn)

        '''
        # anagramMap = defaultdict(list)
        # for s in strs:
        #     sorted_s = tuple(sorted(s))
        #     anagramMap[sorted_s].append(s)
        # #print(anagramMap.values())
        # return list(anagramMap.values())

        '''
        App 2: 
        create a freq array of length 26, given string only contains lowercase english character
        freqMap = defaultdict
        for each string s in strs:
            freq = [0]*26
            for c in s:
                freq[ord[c]- ord['a']] +=1
            freqMap[tuple(freq)].append(s)
        return list(freqMap.values)
total run time : O(n*m)
        '''
        anagramMap = defaultdict(list)
        for s in strs:  # O(m)
            freq = [0]*26
            for c in s.lower():     #O(n)
                freq[ord(c) - ord('a')] +=1
            anagramMap[tuple(freq)].append(s)
        return list(anagramMap.values())