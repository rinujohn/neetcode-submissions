class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complement_dict = new HashMap();
        int[] result = new int[2];
        for (int i = 0;i<nums.length;i++){
            complement_dict.put(target-nums[i],i);
        }
        for (int i = 0;i<nums.length;i++){
            if(complement_dict.containsKey(nums[i]) && complement_dict.get(nums[i]) != i){
                result[0] = i;
                result[1] = complement_dict.get(nums[i]);
                
                break;
            }
        }
        return result;
    }
}



/*
two sum pair
input : num list and target sum

return indices of two number from list whose sum is target

for i in nums:
    search = target- nums[i]
    for j in i+1 to nums.length:
        if search == nums[j]
          return [i,j]

// how to reduce this to linear time:

if input is sorted


for each number find its complement

see if the value present in the key or not 
if do return their indices


more than target, 9 reset to 5 


*/