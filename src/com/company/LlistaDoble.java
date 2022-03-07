package com.company;

public class LlistaDoble<T> {
    private Node first;
    private Node last;
    private Node head;
    private int nElem;

    //Constructor
    public LlistaDoble(){
        first =  null;
        last = null;
        head = null;
        nElem = 0;
    }

    //Adding the first node to the list
    public void addFirst(T data){
        if(first == null && last == null){
            first = new Node<T>(data);
            head = first;
            nElem++;
            System.out.println("Created");
        }
    }

    //Add node at the end of the list
    public void addNode(T data){
        Node temp = new Node<T>(data);
        //TODO
    }

    //Show all elements from the doubly linked list
    public void listar(){
        int i = 0;
        Node actual =  first;
        System.out.println("List:");
        while(i < nElem) {
            System.out.println(actual.getData());
            actual.getNext();
            i++;
        }
    }
}
