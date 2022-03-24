package com.company;

public class DoublyLinkedList<T> {
    private Node<T> tail;
    private Node<T> head;
    private int nElem;

    //Constructor
    public DoublyLinkedList(){
        head =  null;
        tail = null;
        nElem = 0;
    }


    //Add node at the end of the list
    public void addNode(T data){
        Node<T> temp = new Node<>(data);
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

    //Add node at a given position
    public void addNodePos(int pos, T data) throws PersonalException {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(null);
        newNode.setPrev(null);

        if(pos < 1) {
            throw new PersonalException("Couldn't add the node in this position");
        }
        else if(pos > nElem)
            throw new PersonalException("Couldn't add the node in this position");
        else if(pos == 1){
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }else{
            Node<T> temp = head;
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
        Node<T> aux = head;
        int cont = 1;
        T data = null;
        if(head == null)
            System.out.println("The list is empty");
        else{
            while(cont <= pos){
                if(cont == pos)
                    data = aux.getData();
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
    private void deleteNode(Node<T> del){
        if(head == null || del == null)
            System.out.println("test");
        if(head == del)
            head = del.getNext();
        if(del.getNext() != null)
            del.getNext().setPrev(del.getPrev());

        if(del.getPrev() != null)
            del.getPrev().setNext(del.getNext());

        del = null;
    }

    public void deleteNodeAtGivenPos(int pos){
        if(head == null || pos <= 0)
            return;

        Node<T> current = head;

        for(int i = 1; current != null && i < pos; i++)
            current = current.getNext();

        if(current == null)
            return;

        deleteNode(current);
        nElem--;
    }
    //TODO
    //public int search(T data)

    //Show all elements from the doubly linked list
    public void showAll(){
        Node<T> aux = head;
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
