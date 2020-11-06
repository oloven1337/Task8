package com.mirea;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity=capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void add(Object element){
        capacity--;
        if(capacity>=0){
            content.add((E) element);
        }
    }
    public String toString(){
        return content.toString();
    }
}
