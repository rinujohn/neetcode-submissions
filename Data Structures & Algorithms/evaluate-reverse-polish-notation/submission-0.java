class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> number = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(isNumeric(tokens[i])){
                number.push(Integer.parseInt(tokens[i]));
            }else{
                
                int elemTwo = number.pop();
                int elemOne = number.pop();
                if(tokens[i].equals("+")){
                    number.push(elemOne+elemTwo);
                }else if(tokens[i].equals("-")){
                    number.push(elemOne-elemTwo);
                }else if(tokens[i].equals("*")){
                    number.push(elemOne*elemTwo);
                }
                else if(tokens[i].equals("/")){
                    number.push(elemOne/elemTwo);
                }
            }
           // System.out.println(number);
        }
        return number.pop();
    }
    public boolean isNumeric(String elem){
        try{
            int val = Integer.parseInt(elem);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
/*
Declare a stack for integers
for i = 0 to length(token)-1:
    if token[i] == number:
        push token[i] to stack
    else:
        pop last two elements
            result = element_1 token[i] operation element_2
            push result to stack  

return last element from the stack


1,2,+

stack [1]
stack [1,2]
token[i] = +
element_1 = 2
element_2 = 1
result = 2+1
stack[3]
return 3.

handle is numeric case: 

*/