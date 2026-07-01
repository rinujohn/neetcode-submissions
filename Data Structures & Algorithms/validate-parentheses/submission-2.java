class Solution {
    public boolean isValid(String s) {
        Stack<Character> paraStack = new Stack<>();
        for(char i : s.toCharArray()){
            if(i =='{' || i == '[' || i == '('){
                paraStack.push(i);
            }else{
                if(paraStack.isEmpty()){
                    return false;
                }
               char last =  paraStack.pop();
               if((i =='}' &&  last =='{') || (i ==']' &&  last =='[')
               || (i ==')' &&  last =='(')){
                continue;
               }else{
                return false;
               }
            }
        }
        if(paraStack.isEmpty())
        return true;
        else
            return false;
    }
}
