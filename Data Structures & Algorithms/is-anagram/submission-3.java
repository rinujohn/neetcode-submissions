class Solution {
    public boolean isAnagram(String s, String t) {

        /*
        strings are immutable.
        O(1) case is violated
        O(1) means constant space. 
        */
        // if (s.length()!= t.length()){
        //     return false;
        // }else{
        //     for (int i=0;i<s.length();i++){
        //         char selected = s.charAt(i);
        //         int t_index = t.indexOf(selected);
        //         if(t_index==-1){
        //             return false;
        //         }else{
        //           if(t.length()==0){
        //             return false;
        //           }else{

                  
        //             if(t_index == t.length()-1){
        //                 t= t.substring(0,t.length()-1);
        //             }else{
        //                 t = t.substring(0,t_index)+t.substring(t_index+1);
        //             }
        //               }
        //         }
        //     }
            
        //         return true;
            
           /*
           aternative approach,
           create an array of size 26.  
           for i = 0 to s length:
                int alpha = s[i] - 'a'
                decrement array[alpha];
            for j = 0 to t length:
                int alpha = t[i]-'a'
                increment array[alpha]

            check if array is zero. 

           reduce the asci code value of a from all elements

           how to check if an entire array is zero
           */
           if(s.length()!=t.length()){
            return false;
           }else{
            int[] charArray = new int[26];
                for (int i=0;i<s.length();i++){
                    int alpha = s.charAt(i)-'a';
                    int t_alpha = t.charAt(i)-'a';
                    charArray[alpha]++;
                    charArray[t_alpha]--;
                 }
            for(int i=0;i<26;i++){
                if(charArray[i]!=0){
                    return false;
                }
            }
            return true;
           }
           
           
        }
    
}
