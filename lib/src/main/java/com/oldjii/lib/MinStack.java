package com.oldjii.lib;

class MinStack {
    List<Integer> date;

    /** initialize your data structure here. */
    public MinStack() {
        date = new ArrayList<>();
    }

    public void push(int x) {
        date.add(x);
    }

    public void pop() {
        date.remove(date.size() - 1);
    }

    public int top() {
        return date.get(date.size() - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < date.size(); i++) {
            if(date.get(i) < min) {
                min = date.get(i);
            }
        }

        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
