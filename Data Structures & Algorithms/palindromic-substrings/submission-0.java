class Solution {
    public int countSubstrings(String s) {
        int [][] dp = new int[s.length()][s.length()];
        int sum = 0;
        int j ;
        for (int i=0;i<s.length();i++){
            dp[i][i] = 1;
            sum = sum+1;

        }
        for (int i =0; i< s.length()-1;i++){
             j = i+1;
            if (s.charAt(i) == s.charAt(j)){
                dp[i][j] = 2; 
                sum = sum+1;
            }
        }
        int width = 2;

        while(width < s.length()){
            for (int i = 0; (i + width)<s.length();i++){
                //System.out.println(i + " "+ (i+width));
                 j =i+width;
                if(s.charAt(i) == s.charAt(i+width) && dp[i+1][j-1] !=0){
                    dp[i][j] =  2 + dp[i+1][j-1];
                    sum = sum+1;
                }
            }
            width++;
        }
        return sum;
    }
}
