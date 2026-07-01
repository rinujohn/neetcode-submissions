class MinStack {
    private Stack<Integer> elements = null;
    private Stack<Integer> minPrefix = null;

    public MinStack() {
       elements = new Stack<>();
        minPrefix = new Stack<>();
    }
    
    public void push(int val) {
        elements.push(val);
        if(minPrefix.isEmpty()){
            minPrefix.push(val);
        }else{
            int min = minPrefix.peek()<val ? minPrefix.peek() : val;
            minPrefix.push(min);
        }
        
    }
    
    public void pop() {
        elements.pop();
        minPrefix.pop();
    }
    
    public int top() {
       return elements.peek();
    }
    
    public int getMin() {
        return minPrefix.peek();
    }
}
