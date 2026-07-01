class Solution {
    public boolean isPalindrome(String s) {
        String formated = "";

        for(int i=0;i< s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                formated = formated+Character.toLowerCase(s.charAt(i));
            }
        }
        if (formated.length() == 0){
            return true;
        }
        for(int i =0 ; i <=(formated.length()/2); i++){
            if (formated.charAt(i) != formated.charAt(formated.length()-1-i)){
                return false;
            }
        }
    return true;
    }
}

/*
for i = 0 to n/2:
    compare s[i] to s[length-i]

    if unequal return false

on sucessfull completion of for loop return true

*/