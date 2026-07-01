class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> lengthMap = new HashMap();
        int maxLength = 0;
        for (int n : nums){
            if (lengthMap.containsKey(n)){
                continue;
            }
            int left = lengthMap.getOrDefault(n-1,0);
            int right = lengthMap.getOrDefault(n+1,0);
            int new_length = left + right + 1;
            maxLength = Math.max(maxLength,new_length);
            lengthMap.put(n, new_length);
            lengthMap.put(n-left, new_length);
            lengthMap.put(n+right, new_length);
            
        }
        return maxLength;
    }
}
/*
create a ditonary
for each element in num
    dict[num] = num+1
max_count = 0 

for each element in num:
    list.add(num)
    
    next_key = dict.get(num)
    while (dict contains next_key):
        value = dict[next_key]
        next_key = dict[value]




        if i perform a sort
        will it work , no

        dynamic programming solution

        sub problem:
        maximum length of longest increasing sequence using 1,2, .. , i element
        
        base case = T[1] = 1

        T [i] = 1 + max(T[j]) 1<=j<i and num[i] = num[j]+1
        this is O(n^2)


optimal solution after refering solution

    dictonary store the start location and max length on left and right hand side


    left = get or default from map(n-1)
    right = get or default(n+1)
    new_length = left+right+1

    map.put(left, n-left)
    map.put(right,n+right)
 
*/