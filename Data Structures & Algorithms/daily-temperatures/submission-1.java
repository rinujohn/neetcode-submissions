class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       
       
        int[] result = new int[temperatures.length];
        //O(n)
        // for (int i =0;i<temperatures.length;i++){
        //     result[i] = 0;
        //     for (int j= i+1;j<temperatures.length;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             result[i] = j-i;
        //             break;
        //         }
        //     }
        // }
        Stack<int[]> minStack = new Stack<>();
        for (int i =0;i<temperatures.length;i++){
            while(!minStack.isEmpty() && temperatures[i]>minStack.peek()[1]){
                int[] elem = minStack.pop();
                result[elem[0]] = i - elem[0];

            }
            minStack.push(new int[]{i,temperatures[i]});
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
time complexity: O(n^2),
extra space complexity : O(1) output datastructure space is not treated as extra space


how to reduce to O(n) time complexity

insert all elements 
maximum stack

    how to identify future index with value greater than current

    monotonically decreasing stack

    for i = 0 to length(tempratures):

            while stack is not empty and temp[i]> stack top element:
                index, val = stack.pop()
                result[index] = i - index
            
            push element and index to the stack

*/