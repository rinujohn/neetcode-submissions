class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int zeroCount = 0;
        int[] result = new int[nums.length];
        for (int num : nums){
            if(num == 0){
                zeroCount++;
            }else{
                totalProduct = totalProduct * num;
            }
            
        }
        for (int i=0;i< nums.length;i++){
            if(zeroCount>0){
                if (nums[i] != 0){
                    result[i] = 0;
                }
                else{
                    if(zeroCount>1){
                        result[i] = 0;
                    }else{
                         result[i] = totalProduct;
                    }
                }
            }else{
                result[i] = totalProduct/nums[i];
            }
        }
        return result;
    }
}  
