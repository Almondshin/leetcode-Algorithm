class MinStack {
    Stack<Integer> stack;
    List<Integer> list;

    public MinStack() {
        stack = new Stack();
        list = new ArrayList();
        
    }
    
    public void push(int val) {
        stack.push(val);
        list.add(val);
    }
    
    public void pop() {
        int val = stack.pop();
        list.remove(new Integer(val));
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Collections.sort(list);
        return list.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */