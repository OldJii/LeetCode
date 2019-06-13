package com.oldjii.lib;

class MovingAverage {

    private int size = 0;
    private double sum = 0.0;
    private Queue<Integer> queue = new LinkedList<>();

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        sum += val;
        queue.offer(val);
        if (queue.size() > this.size) {
            sum -= queue.remove();
        }
        return sum / queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */