package com.oldjii.lib;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(!queue1.isEmpty()) {
            int temp = queue1.poll();
            if(queue1.isEmpty()) {
                while(!queue2.isEmpty()) {
                    queue1.offer(queue2.poll());
                }
                return temp;
            } else {
                queue2.offer(temp);
            }
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        while(!queue1.isEmpty()) {
            int temp = queue1.poll();
            if(queue1.isEmpty()) {
                queue2.offer(temp);
                while(!queue2.isEmpty()) {
                    queue1.offer(queue2.poll());
                }
                return temp;
            } else {
                queue2.offer(temp);
            }
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
