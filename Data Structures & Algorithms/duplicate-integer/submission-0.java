class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i<nums.length;i++){
            //System.out.println(uniqueNumbers.add(nums[i]));
            if(!uniqueNumbers.add(nums[i])){
                return true;
            }
            
        }
        return false;

    }
}
