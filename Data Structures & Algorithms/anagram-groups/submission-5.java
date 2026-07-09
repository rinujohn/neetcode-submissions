class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
Map<String, List<String>> dictionary = new HashMap<>();

List<List<String>> result = new ArrayList<>();



if (strs.length == 1){
    result.add (new ArrayList<>(List.of(strs)));
}
else{

 for (String word : strs){
String key = generateFreqString(word);

if(dictionary.containsKey(key)){
	dictionary.get(key).add(word);
}else{
dictionary.put(key, new ArrayList<>(List.of(word)));
}
	
}

// List<List<String>> result  = dictionary.values().stream().collect(Collectors.toList());
result  = dictionary.values().stream().toList();


}
return result;
    }


public static String generateFreqString(String word){

int[] freqCount = new int[26];
for (char c : word.toCharArray()){
 int index = c - 97;
freqCount[index]++;
}
return Arrays.toString(freqCount);

    }
}

    //     HashMap<HashMap, List<String> > freqMap = new HashMap();
    //     for(String s : strs){
    //         HashMap<Character, Integer> countMap = new HashMap();
            
    //         for (Character c : s.toCharArray()){
    //             if (countMap.containsKey(c)){
    //                      countMap.put(c, countMap.get(c)+1);
    //             }else{
    //                 countMap.put(c, 1);
    //             }
    //         }
    //         if(freqMap.containsKey(countMap)){
    //             freqMap.get(countMap).add(s);
    //         }else{
    //            LinkedList<String> stringList = new LinkedList();
    //            stringList.add(s);
    //             freqMap.put(countMap,stringList);
    //         }
            
    //        // System.out.println(freqMap);
    //     }
         
    //     return new ArrayList<List<String>> (freqMap.values());
    // 


/*

iterate throught the list and create keys by sorting them

add elements with same key to same list

iterate first create a frequency map for each string
O(n+m)
take next item , identify if any one them have similar frequency map
    key: letter : frequency map

for each alphabet,
    get its freqency map
    check for anagram equality,
    if found create the result map
O()
*/