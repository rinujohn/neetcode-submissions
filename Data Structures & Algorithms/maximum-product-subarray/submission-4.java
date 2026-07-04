class Solution {
    public int maxProduct(int[] nums) {
    //int[] T = new int[nums.length];
    int[] minT = new int[nums.length];
    int[] maxT = new int[nums.length];
   // T[0] = nums[0];
    maxT[0] = nums[0];
    minT[0] = nums[0];
    int max = nums[0];
    
    for(int i =1; i< nums.length;i++){
        minT[i] = Math.min( nums[i],Math.min(minT[i-1]* nums[i], maxT[i-1]* nums[i]) );
        //maxT[i] = Math.max(maxT[i-1]* nums[i] , nums[i]);
        maxT[i] = Math.max( nums[i],Math.max(minT[i-1]* nums[i], maxT[i-1]* nums[i]) );
        max = Math.max(max, maxT[i]);
        
    }        
    return max;
    }
}
/*
T[i] = represent the maximum product of a subarray from a_1 to a_i which includes a_i

every step, i have to make a decision should i take a_i
a_i included  T[i-1]*a_i
special case a_i is negative and T[i-2]
or a_i only

T[1] = a_1

T[i] = max{a_i, a_i * T[i-1]}

*/