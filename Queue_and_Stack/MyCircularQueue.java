import java.util.List;
import java.util.ArrayList;


class MyCircularQueue {
    
    private int[] data;
    private int arrayLength;
    private int head;
    private int end;
    private int count;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        arrayLength = k;
        head = 0;
        end = 0;
        count = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        } else if(isEmpty()) {
            data[end] = value;
            count = count + 1;
            return true;
        } else {
            end = findNext(end);
            data[end] = value;
            count = count + 1;
            return true;
        }
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        } else if(head == end){
            data[head] = -1;
            count = count - 1;
            return true;
        } else {
            head = findNext(head);
            count = count - 1;
            return true;
        }
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        } else {
            return data[head];
        }
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        } else {
            return data[end];
        }
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(count == 0){
            return true;
        } else {
            return false;
        }
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(count == arrayLength){
            return true;
        } else {
            return false;
        }
    }

    /** Find the next index of p */
    private int findNext(int p){
        return (p + 1) % arrayLength;
    }

    public static void main(String[] args) {
        int k = 6;
        MyCircularQueue obj = new MyCircularQueue(k);
        obj.enQueue(69);
        obj.deQueue();
        obj.enQueue(92);
        obj.enQueue(12);
        obj.deQueue();
        int a = obj.Front();
        obj.isFull();
        obj.deQueue();
        obj.enQueue(4);
        obj.Rear(); 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */