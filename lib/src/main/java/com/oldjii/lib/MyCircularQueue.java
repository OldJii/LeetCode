package com.oldjii.lib;

class MyCircularQueue {
    private final int capacity;
    private final int[] array;
    private int head = 0, tail = 0, count = 0;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.array = new int[this.capacity];
    }

    public boolean enQueue(int value) {
        //队列已满
        if (isFull())
            return false;

        //队列为空：1.开始 2.删除队列内所有元素，这时需要重置头部
        if (isEmpty()) {
            head = 0;
            tail = head;
            array[tail] = value;
            count++;
            return true;
        }

        //队列未满
        //队列非空但tail到了最后说明前面有可用空间
        if(tail == capacity - 1)
            tail = 0;
        else
            tail++;
        array[tail] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        count--;
        head++;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return array[head];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return array[tail];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}