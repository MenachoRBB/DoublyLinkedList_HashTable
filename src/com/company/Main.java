package com.company;

public class Main {

    public static void main(String[] args) {
	    LlistaDoble<Integer> list = new LlistaDoble();

        list.addNode(23);
        list.addNode(100);
        list.addNode(90);

        list.addNodePos(3, 5000);
        list.addNodePos(3, 4000);

        list.showAll();

        System.out.println("Length of the list: "+list.listLength());

        System.out.println("Posicion 3 de la lista: "+list.getNode(3));

        System.out.println("Borramos la posicion 3 de la lista");
        list.deleteNode(3);
        list.showAll();
        System.out.println("Posicion 3 de la lista acutal: "+list.getNode(3));//5000
        System.out.println("Length of the current list: "+list.listLength());//4


    }
}
