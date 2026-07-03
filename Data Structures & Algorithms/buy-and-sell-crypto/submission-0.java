class Solution {
    public int maxProfit(int[] prices) {
        int[] minLeft = new int[prices.length];
        int lMin = 10;

        for(int i=0;i<prices.length;i++){
            minLeft[i] = lMin;
            if(prices[i]<lMin){
                lMin = prices[i];
            }
        }
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
           maxProfit = Math.max(maxProfit, prices[i]-minLeft[i]);
        }
        return maxProfit;
    }
}


/*
for each buy day i 
    search for sell day i+1 to n

runtime O(n^2)

scan array to create left min array,

 
*/