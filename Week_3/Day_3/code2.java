class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int x) {
        st.push(x);
        if (min.isEmpty() || x <= min.peek()) 
            min.push(x);
    }
    public void pop() {
        if (st.pop().equals(min.peek())) 
            min.pop();
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return min.peek();
    }
}
