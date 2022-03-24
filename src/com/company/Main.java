package com.company;

public class Main {

    public static void main(String[] args) {
	    DoublyLinkedList<Integer> list = new DoublyLinkedList();

        list.addNode(23);
        list.addNode(100);
        list.addNode(90);

        try {
            list.addNodePos(3, 5000);
            list.addNodePos(3, 4000);
        }catch(PersonalException e){
            System.err.println(e);
            System.exit(1);
        }

        list.showAll();

        System.out.println("Length of the list: "+list.listLength());

        System.out.println("Posicion 3 de la lista: "+list.getNode(3));

        System.out.println("Borramos la posicion 3 de la lista");
        list.deleteNodeAtGivenPos(3);
        list.showAll();
        System.out.println("Posicion 3 de la lista acutal: "+list.getNode(3));//5000
        System.out.println("Length of the current list: "+list.listLength());//4


    }
}
