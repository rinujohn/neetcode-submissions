class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1FreqMap = buildFreqMap(s1);
        //System.out.println("s1FreqMap"+s1FreqMap);
        Map<Character, Integer> windowFreqMap = new HashMap<>();
        var L = 0;
        var R = 0;
        var window = s1.length(); //m1 missed semi colon
        while(R< s2.length()){

            windowFreqMap.put(s2.charAt(R), windowFreqMap.getOrDefault(s2.charAt(R),0)+1);

            if(R-L+1 >s1.length()){
                 windowFreqMap.put(s2.charAt(L), windowFreqMap.get(s2.charAt(L))-1);
                 if (windowFreqMap.get(s2.charAt(L)) == 0){ //mistake 2 : forget to remove the zero values from map
                    windowFreqMap.remove(s2.charAt(L));
                 }
                L++;
            }
           // System.out.println("windowFreqMap"+windowFreqMap);
            if(s1FreqMap.equals(windowFreqMap)){
                return true;
            }
            R++;
            
        }
        return false;

    }

    public Map<Character, Integer> buildFreqMap(String s){
        Map<Character, Integer> freqMap = new HashMap<>();

        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }
        return freqMap;
    }
}
/*
check if s2 contains the permutation of s1
sliding window
build the freq map of s1

build freq map for each window
check if they are equal or not

build freqmap for s1

L=0, R= 0
intialize windowFreqMap
while(R<len(S2)):
    windowFreqMap[s2[R]] ++

    if(R-L+1 > len(s1)):
        windowFreqMap[s2[L]]--
        L++
    if( windowFreqMap == freqMap){
        return true}

    R++
return false
*/