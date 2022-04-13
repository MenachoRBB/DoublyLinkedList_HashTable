package com.company;
import java.util.Iterator;

public class CiutadaIterator<T extends Comparable<T>> implements Iterator<T>{
    private Node<T> current;

    public CiutadaIterator(DoublyLinkedList<T> list){
        this.current = list.getFirst();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if(this.hasNext()){
            T data = current.getData();
            this.current = this.current.getNext();
            return data;
        }
        return null;
    }
}
