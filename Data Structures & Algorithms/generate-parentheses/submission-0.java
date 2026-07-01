class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
         backtracking(0,0,n,new StringBuilder(""),result);
         return result;
    }

    public void backtracking(int open, int closed, int n, StringBuilder pairs, 
    List<String> result){
        if(open == closed && open == n){
            result.add(pairs.toString());
            return;
        }
        if(open<n){
            
            pairs.append('(');
            backtracking(open+1,closed, n, pairs, result);
            pairs.deleteCharAt(pairs.length()-1);
        }
        if(closed< open){
            pairs.append(')');
            backtracking(open,closed+1, n, pairs, result);
            pairs.deleteCharAt(pairs.length()-1);
        }
    }
}
/*
input : integer n E [1,7]

output : string array. all possible permutation of paranthesis pairs

1 : ()
2 : ()() ,(())
3: ()()(),(())(),()(()),((())),(()())

from int generate possible elements:
1 - (,) 
 2 (,(, ),)

create all possible permutations

check the validity of each combinations

if valid add to result array


how to generate possible combinations of length n*2:
    for i = 0 to length(tokens):

*/