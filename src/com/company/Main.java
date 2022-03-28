package com.company;

public class Main {

    public static void main(String[] args) {
	    DoublyLinkedList<Integer> list = new DoublyLinkedList();

        list.addNode(23);
        list.addNode(100);
        list.addNode(90);
        list.addNode(50);
        list.addNode(899);
        list.showAll();


        System.out.println("Buscamos el nodo que contiene el numero 100");
        System.out.println("Para llegar al nodo que tiene 100 hemos iterado "+list.search(100)+" veces");


    }
}
