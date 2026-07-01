class Solution {
    public String longestPalindrome(String s) {

        int[][] dp = new int[s.length()][s.length()];
         int j;
         int max_len = -1;
         int start =0, end =0;
        for (int i =0; i< s.length();i++){
            dp[i][i] = 1;
           
            
        }
        for (int i =0; i< s.length()-1;i++){
             j = i+1;
            if (s.charAt(i) == s.charAt(j)){
                dp[i][j] = 2; 
                max_len = 2;
                start = i;
                end = j;
            }
        }
        // for (int i =0; i< s.length();i++){
        // System.out.println(Arrays.toString(dp[i]));
        // }
        int width = 2;
        while(width < s.length()){
        for (int i =0; i + width < s.length();i++){
          //System.out.println(i+" "+(i+width));
          j = i + width;
            if (s.charAt(i) == s.charAt(i+width) && dp[i+1][j-1] >0){
                 
                dp[i][j] = 2 + dp[i+1][j-1];
                if(max_len < dp[i][j]){
                    max_len = dp[i][j];
                    start = i;
                    end = j;
                }
            }
            else{
                dp[i][j] = 0;
            }
        }
        width++;
        }
        // for (int i =0; i< s.length();i++){
        // System.out.println(Arrays.toString(dp[i]));
        // }

        
    return s.substring(start,end+1);
        
    }
}


/*
let T[i,j] = largest common substring between the input S1,S2... Si and Sn,Sn-1..,Sj which muat include
s_i and s_j and  j = n+1-i

base case: T[0,j] = 0 where 0<=j<=n
T[i,0] = 0 where 0<=i<=n

T[i,j] = 1 + T[i-1,j+1]           s_i = s_j 
T[i,j] = 0                   s_i != s_j
where 1<=i<=n and n>=j>=1

number of subproblems 


this need to be solved like a window problem

base case T[i,j] = 1 if i=j 

*/