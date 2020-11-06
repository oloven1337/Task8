package com.mirea;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList{
    E element;
    protected ConcurrentLinkedQueue<E> content=new ConcurrentLinkedQueue<E>();
    public WaitList() { }
    public WaitList(Collection<E> c){
        content.addAll(c);
    }

    @Override
    public void add(Object element) {
        content.add((E) element);
    }

    @Override
    public E remove() {
        content.remove();
        return null;
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection с) {
        return  content.containsAll(с);
    }
    public String toString(){
        return content.toString();
    }
}
