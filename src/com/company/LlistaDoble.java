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

    //Add node in a determined position
    public void addNodePos(int pos, T data){
        Node newNode = new Node(data);
        newNode.setNext(null);
        newNode.setPrev(null);

        if(pos < 1)
            System.out.println("Couldn't add the node in this position");
        else if(pos == 1){
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }else{
            Node temp = new Node(null);
            temp = head;
            for(int i = 1; i < pos-1; i++) {
                if (temp != null)
                    temp = temp.getNext();
            }
                if(temp != null){
                    newNode.setNext(temp.getNext());
                    newNode.setPrev(temp);
                    temp.setNext(newNode);
                    if(newNode.getNext() != null){
                        newNode.getNext().setPrev(newNode);
                    }
                }else
                    System.out.println("The previous node is null");
        }
        nElem++;
    }

    //Return the data of the node of a specific position
    public T getNode(int pos) {
        Node aux = head;
        int cont = 1;
        T data = null;
        if(head == null)
            System.out.println("The list is empty");
        else{
            while(cont <= pos){
                if(cont == pos)
                    data = (T)(aux).getData();
                cont++;
                aux = aux.getNext();
            }
        }
        return data;
    }

    //Return the length of the list
    public int listLength(){
        return nElem;
    }

    //2 functions for delete a node and delete the node at given position
    private Node deleteNode(Node del){
        if(head == null || del == null)
            return null;
        if(head == del)
            head = del.getNext();
        if(del.getNext() != null)
            del.getNext().setPrev(del.getPrev());

        if(del.getPrev() != null)
            del.getPrev().setNext(del.getNext());

        del = null;
        return head;
    }

    public void deleteNodeAtGivenPos(int pos){
        if(head == null || pos <= 0)
            return;

        Node current = head;

        for(int i = 1; current != null && i < pos; i++)
            current = current.getNext();

        if(current == null)
            return;

        deleteNode(current);
        nElem--;
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
