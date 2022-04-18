package com.company;

public class Node<T> {
    private final T data;
    private Node<T> next;
    private Node<T> prev;

    public Node(T data){
        this.data =  data;
        this.next = null;
        this.prev = null;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public Node<T> getPrev(){
        return prev;
    }

    public void setNext(Node<T> n){ next = n; }

    public void setPrev(Node<T> n){
        prev = n;
    }
}
