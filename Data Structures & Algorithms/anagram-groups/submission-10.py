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
        anagramMap = defaultdict(list)
        for s in strs:
            sorted_s = tuple(sorted(s))
            anagramMap[sorted_s].append(s)
        #print(anagramMap.values())
        return list(anagramMap.values())