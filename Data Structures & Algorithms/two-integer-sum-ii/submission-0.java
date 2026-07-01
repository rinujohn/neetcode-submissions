class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start< end){
          int  sum = numbers[start] + numbers[end];
            if(sum< target){
                start = start+1;
            }else if(sum> target){
                end = end -1 ;
            }else{
                break;
            }
        }
        return new int[]{start+1,end+1};
    }
}
/*
4,5,8,11

target 13

4,11 = 15  sum > target

moving lower index only increase the sum
moving the upper index down will decrease the sum

*/