package com.company;
import java.util.Iterator;

public class CiutadaIterator<T> implements Iterator<T>{
    private DoublyLinkedList<T> list;
    private int pos;

    public CiutadaIterator(){
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        return (pos < list.listLength());
    }

    @Override
    public T next() {
        DoublyLinkedList<T> elem = list;
        pos++;
        return (T) elem;
    }
}
