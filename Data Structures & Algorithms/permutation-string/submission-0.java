class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        var L = 0;
        var R = 0;

       var freqMap =  buildFreqMap(s1);
       Map<Character, Integer>  windowFreqMap = new HashMap<>();
       while(R< s2.length()){
            if (windowFreqMap.containsKey(s2.charAt(R))){
                windowFreqMap.put(s2.charAt(R), windowFreqMap.get(s2.charAt(R))+1);
            }else{
                    windowFreqMap.put(s2.charAt(R), 1);
            }

            if(R-L+1 > s1.length()){
                windowFreqMap.put(s2.charAt(L),windowFreqMap.get(s2.charAt(L))-1);
                if (windowFreqMap.get(s2.charAt(L)) == 0){
                    windowFreqMap.remove(s2.charAt(L));
                }
                L++;
            }
            if (windowFreqMap.equals(freqMap)){
                return true;
            }
        R++;

       }
       return false;
    }
    public Map<Character, Integer> buildFreqMap(String s1){
        Map<Character, Integer> freqMap = new HashMap<>();
         for (char c : s1.toCharArray()){
            if (freqMap.containsKey(c)){
                freqMap.put(c, freqMap.get(c)+1);
            }else{
                    freqMap.put(c, 1);
            }
        }
         return freqMap;
    }
}

/*
two pointers

for each character c in s2:
    check if c present in s1
        if yes increment look for next n characters 
        if they are also part of s1
        return true
    if mismatch is found:
        reset the count and scan again



updated brute force steps:
runtime : O(n^2)

create a frequency map of s1
j = length of s1 -1
for each character in c:
    if c is part of s1:
        reduce the count in frequency map
        for next j characters:

            reduce the freq map
            if key not found break inner loop reset the map
    if freq_map = 0:
        return true
    else:
        reset the freq map to initial value

return false

Sliding window approach 1:

    L,R = 0
    create a frequency map of S1
    
    while(R< length(s1)):
        check if s2[R] in freq_map
            reduce the count
        else:

issue: trying to reset everything if window become invalid

correction: keep the loop despite the window is invalid


Sliding window approach 2:

L,R = 0
w_size = len(s1)
create freq map of s1

declare a empty window_freq map

while(R < length(s2)):
    window_freq[s2[R]] ++

    if(R-L+1 > w_size):
        window_freq[s2[L]]--
        L++
    check if freq_map == window_freq
    R++
return false;

correction: no nee d
*/  