class MinStack {
    private Stack<Integer> mainStack = new Stack();
    private Stack<Integer> minStack = new Stack();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        mainStack.push(x);
        if(minStack.empty())
            minStack.push(x);
        else if (x <= minStack.peek())
            minStack.push(x);
    }
    
    public void pop() {
        int val = mainStack.pop();
        if(val == minStack.peek())
            minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}