package com.company;

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> bef;

    public Node(T data){
        this.data =  data;
        this.next = null;
        this.bef = null;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public Node<T> getBef(){
        return bef;
    }

    public void setData(T d){
        data = d;
    }

    public void setSeg(Node<T> n){ next = n; }

    public void setAnt(Node<T> n){
        bef = n;
    }


}
