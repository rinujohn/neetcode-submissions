class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        int frequency;
        for(int i =0; i<nums.length;i++){
             frequency = freqMap.getOrDefault(nums[i],0);
             freqMap.put(nums[i],frequency+1);
        } 
        int[][] freqArray = new int[freqMap.size()][2];
        int i =0;
        for(Map.Entry<Integer, Integer> kv : freqMap.entrySet()){
            freqArray[i][0] = kv.getKey();
             freqArray[i][1] = kv.getValue();
              System.out.println(Arrays.toString(freqArray[i]));
            i++;
        }
        //System.out.println(Arrays.toString(freqArray[0]));
        Arrays.sort(freqArray, (a,b)->Integer.compare(b[1],a[1]));
        int[] result = new int[k];
        // System.out.println(Arrays.toString(freqArray[k-1]));
        for(int j = 0;j<k;j++){
             //System.out.println(freqMap.size());
            result[j] = freqArray[j][0];
        }
       // System.out.println(Arrays.toString(result));
        return result;
    }
}
