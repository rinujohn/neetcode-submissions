class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] T = new int[cost.length+1];

        T[0] = 0;
        T[1] = 0;

        for(int i=2;i<=cost.length;i++){
            T[i] = Math.min(cost[i-1]+T[i-1],cost[i-2]+T[i-2]);
        }
return T[cost.length];
    }
}
