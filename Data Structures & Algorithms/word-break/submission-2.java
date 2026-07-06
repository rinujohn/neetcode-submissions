class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] T = new boolean[s.length()+1];
        Arrays.fill(T,false);
        T[0] =true;

        for(int i=1;i<s.length()+1;i++){
            
            for(int k = 0;k<i;k++){
                if(T[k] == true && wordDict.contains(s.substring(k,i))){
                    T[i] = true;
                    break;
                }

            }



        }
return T[s.length()];

    }
}


/*
T[i] represent if s[1, 2, ... i] is a valid string

s[i] = wordDict contains s[k+1 : i]  for k<i and T[k]= True


*/