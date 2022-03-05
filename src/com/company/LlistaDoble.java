package com.company;

public class LlistaDoble<T> {
    private Node first;
    private Node last;
    private int nElem;

    //Constructor
    public LlistaDoble(){
        first =  null;
        last = null;
        nElem = 0;
    }

    //Adding data to the list
    public void addNode(T data){
        if(first == null && last == null){
            first = new Node<>(data, first, null);
            System.out.println("Creado");
        }
    }

    //Show all elements from the linked list
    public void listar(){
        Node actual =  first;
        System.out.println("List:");
        while(actual.getNext() != null){
            System.out.println(actual.getData());
            actual = actual.getNext();
        }
    }
}
