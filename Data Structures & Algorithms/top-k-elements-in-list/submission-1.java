class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap();
        for(int i : nums){
           if (freqMap.containsKey(i)){
                freqMap.put(i,freqMap.get(i)+1 );
           } else{
            freqMap.put(i,1);
           }
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList(freqMap.entrySet());
        entryList.sort((e1,e2) ->(e2.getValue().compareTo(e1.getValue())));
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = entryList.get(i).getKey();
        }
        return result;
    }
}
/*
top k frequent element need to be returned
input: integer array and k

count the frequncy using 2000 size array,

take the frequency map and sort it based on freq count
 and return the first k elements

 create a frequency counter
 then iterate through it 
 and add it to a priority queue
 and return top k elements of the priority queue


*/