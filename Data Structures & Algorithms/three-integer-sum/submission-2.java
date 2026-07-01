class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int target = 0;
        int start = 0;
        int end = nums.length-1;
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i =0; i< nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
            target = - nums[i];
            start = i+1;
            end = nums.length-1;
            while( start< end){
                
                 sum = nums[start] + nums[end];
                if(sum<target){
                    start = start+1;
                }else if (sum>target){
                    end = end -1;
                }else{
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;
                    start = start+1;
                    end = end -1;
                }
            }

        }
        
        return result;
    }
}
/*
sort the elements

for n in nums:
    target = -n
    start = 
    skip = index of n

    while( start or end != skip and start < end){
        if sum< target:
         move start
        else if sum > target:
            move end
        else 
            break

return n, nums[start], nums[end]
    }
*/