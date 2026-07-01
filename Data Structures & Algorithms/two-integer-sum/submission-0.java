class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        int difference;
        int [] result = new int[2];
        for (int i=0;i<nums.length;i++){
            
            if(diffMap.containsKey(nums[i])){
                result[0] = diffMap.get(nums[i]);
                result[1] = i;
                return result;
            }else{
                difference = target - nums[i];
                diffMap.put(difference,i);
            }
        }
        return result;
    }
}
