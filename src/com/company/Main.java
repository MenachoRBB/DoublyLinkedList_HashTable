package com.company;

public class Main {

    public static void main(String[] args) throws PersonalException {
	    DoublyLinkedList<Ciutada> list = new DoublyLinkedList();

        Ciutada test1 = new Ciutada("Ivan", "Menacho", "48275497S");
        Ciutada test2 = new Ciutada("Joel", "Marti", "47275497S");
        Ciutada test3 = new Ciutada("Antonio", "Matas", "46275497S");
        Ciutada test4 = new Ciutada("Ivan", "Gonzalez", "45275497S");
        Ciutada test5 = new Ciutada("Husema", "Ramos", "44275497S");
        Ciutada test6 = new Ciutada("Error", "Error", "Error");

        list.addNode(test1);
        list.addNode(test2);
        list.addNode(test3);
        list.addNode(test4);
        list.addNode(test5);
        list.showAll();

        try{
            System.out.println(list.search(test6));
        }catch(PersonalException e){
            System.err.println(e);
        }


    }
}
