class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        if(nums.length == 1){
            return nums[0];
        }
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i< nums.length; i++){
            dp[i]  = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[nums.length -1];



    }
}

/*
16 minutes : 
1. T[i] maximum amount of money can be robbed from sub set of houses 1,2 , ... i which may or may not include ith house

2. 
Base case: T[0] = 0, T[1] = nums[1]

T[i] = max{T[i-2] + nums[i], T[i-1]} where 2<=i<=n

3.
a. number of subproblems = O(n)
b. runtime to fill DP table = O(n)
c. final result can be retrived from T[n]
d. runtime to retrive final result = O(1)


*/