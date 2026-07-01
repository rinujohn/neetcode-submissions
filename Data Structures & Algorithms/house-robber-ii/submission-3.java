class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }else if (nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] T = new int[nums.length-1];
        int[] D = new int[nums.length-1];

        T[0] = nums[0];
        D[0] = nums[1];
        T[1] = Math.max(nums[0],nums[1]);
        D[1] = Math.max(nums[1],nums[2]);
        for (int i = 2; i< nums.length-1;i++){

            T[i] = Math.max(T[i-1], T[i-2] + nums[i]);
            D[i] = Math.max(D[i-1], D[i-2] + nums[i+1]);
        }

        return Math.max(T[nums.length-2],D[nums.length-2]);
    }
}
/**
T[i] = maximum value we can achive from 1 to i houses after robbing house 1
D[i] = maximum value we can achive from 2 to n houses which includes house n. 

base case :
T[1] = nums[1] 
T[2] = max(T[1], nums[2])

T[i] = max(T[i-1], nums[i] + T[i-2]) where 3<=i<= n-1

D[1] = nums[2]
D[2] =max(D[1], nums[3])
D[i] = max(D[i-1], nums[i+1] + D[i-2]) where 3<=i<= n-1




D[]
*/