class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i =0;i<temperatures.length;i++){
            result[i] = 0;
            for (int j= i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    result[i] = j-i;
                    break;
                }
            }
        }
        return result;
    }
}
/*
0   1  2  3  4  5. 6
30 38 30 36 35 40 28
1   4  1  2  1. 0. 0 
how far is the increasing value from current

for i = 0 to length(tempratures) -1:
    identify immediate future index whose value is greater than current
    result[i] = future index- current index
    if no such value  result[i] = 0


    how to identify future index with value greater than current

    for j = i+1 to length(temperatures) -1:
        result[i] = 0
        if (tempratures[j]>tempratures[i]):
            result[i] = j-i;
            break;

*/