class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        

        '''
        group the anagrams

        create freq map for each string O(n*m), space O(m)

        use the freq map as the key of dict value as list of string
        count objects are unhasahble
        return value list 
 
        runtime: O(m*n)
        mistake: array, list and Counter objects are unhashable

        Approach 2:
        sort will take nlogn *m

        create a freq list
        convert that into a string
        use that as a key
        aggregate all values

        '''
        res = defaultdict(list)
        for s in strs:
            freq = [0]*26
            for c in s:
                freq[ord(c) - ord('a')]+=1
            res[tuple(freq)].append(s)

        return list(res.values())
           