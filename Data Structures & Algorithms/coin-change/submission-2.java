class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] T = new int[amount+1];
        Arrays.fill(T, Integer.MAX_VALUE);
        T[0] = 0;
        
        

        for(int i = 1; i< T.length;i++){

        //  List<Integer> candidateCoins =  Arrays.stream(coins).filter(coin -> coin<=i).boxed().collect(Collectors.toList());
          for (int j = 0; j< coins.length;j++){
            if(coins[j]<=i && T[i - coins[j]] != Integer.MAX_VALUE){
                T[i] = Math.min(T[i], 1+ T[i-coins[j]]);
            }
            
          }
        }
        //System.out.println(Arrays.toString(T));
        if(T[amount] == Integer.MAX_VALUE ){
            return -1;
        }else{
            return T[amount];
        }
        
    }
}
/*
input : coins array
target amount amount
minimum number of coins required to make exact target amount

unlimited supply of coins:

maximum value at most j

T[i] = minimum number of coins with total value exactly i.

T[0] = 0
T[i] = min (T[i- coins[k]]) + 1  where coins[k] <=i 
     = infinity otherwise


*/