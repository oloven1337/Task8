package com.mirea;

import java.util.Collection;

public interface IWaitList<E> {
    public void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);

}

