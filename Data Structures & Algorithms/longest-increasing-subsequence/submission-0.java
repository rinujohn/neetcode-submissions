class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] T = new int[nums.length+1];
        Arrays.fill(T,1);
        int max = 1;
        for(int i=0;i<nums.length;i++){

            for(int j =0; j<i;j++){
                if(nums[j]< nums[i]){
                    T[i] = Math.max(T[i], 1 + T[j]);
                }
            }
            max = Math.max(max,T[i]);
        }
        return max;

    }
}
/*
length of longest increasing subsequence

T[i] = length of longest increasing subsequence in a1, a2, .. ai ending at a_i



T[1] = 1
T[i] = 1+ max{ T[k]} where a_k<a_i and 0<k<i

return max( T[:])
*/