package com.company;

public class MainHashTable {
    public static void main(String[] args){

        HashTable<Integer, String> table = new HashTable<>(3);

        try {
            table.add(100, "test1");
            table.add(200, "test2");
            table.add(300, "test3");
            table.add(550, "test4");
            table.add(444, "test5");
            table.add(888, "test6");
            table.add(555, "test7");
        }catch (PersonalException e){
            System.err.println(e);
        }

        table.remove(100);
        table.remove(444);

        System.out.println("Table nElems: "+table.getnElem());
        System.out.println("The value at the key 100 is: "+table.get(100));
        System.out.println("The value at the key 200 is: "+table.get(200));
        System.out.println("The value at the key 300 is: "+table.get(300));
        System.out.println("The value at the key 550 is: "+table.get(550));
        System.out.println("The value at the key 444 is: "+table.get(444));
        System.out.println("The value at the key 888 is: "+table.get(888));

        System.out.println();

        try {
            System.out.println("Se han recorrido: " + table.search(550));
        }catch(PersonalException e){
            System.err.println(e);
        }

        System.out.println("Factor de carga: "+table.loadFactor());

        DoublyLinkedList llistaEnllasada = table.getValues();

        llistaEnllasada.showAll(llistaEnllasada);

        DoublyLinkedList llistaEnllasada2 = table.getKeys();
        llistaEnllasada2.showAll(llistaEnllasada2);



    }
}
