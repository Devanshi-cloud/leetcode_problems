class StockSpanner {

    private Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span =1;
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1]; // Add the span of the popped element
        }
        
        // Push the current price and its computed span onto the stack
        st.push(new int[]{price, span});
        
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */