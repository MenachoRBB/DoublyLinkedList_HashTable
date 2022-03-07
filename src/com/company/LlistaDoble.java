package com.company;

public class LlistaDoble<T> {
    private Node tail;
    private Node head;
    private int nElem;

    //Constructor
    public LlistaDoble(){
        head =  null;
        tail = null;
        nElem = 0;
    }


    //Add node at the end of the list
    public void addNode(T data){
        Node temp = new Node<T>(data);
        if(this.head == null){
            head = temp;
            tail = temp;
            head.setPrev(null);
            tail.setNext(null);
        }else{
            tail.setNext(temp);
            temp.setPrev(tail);
            tail = temp;
            tail.setNext(null);
        }
        nElem++;
    }

    //Show all elements from the doubly linked list
    public void showAll(){
        Node aux = head;
        if(head == null)
            System.out.println("The list is empty");
        else{
            System.out.println("List of nodes:");
            while(aux != null){
                System.out.println(aux.getData());
                aux = aux.getNext();
            }
        }
    }
}
