package com.company;

public class MainHashTable {
    public static void main(String[] args){

        HashTable<Integer, String> table = new HashTable<>(4);

        try {
            table.add(100, "test1");
            table.add(200, "test2");
            table.add(300, "test3");
            table.add(550, "test4");
        }catch (PersonalException e){
            System.err.println(e);
        }

        //table.remove(100);

        System.out.println("Table nElems: "+table.getnElem());
        System.out.println("The value at the key 100 is: "+table.get(100));
        System.out.println("The value at the key 200 is: "+table.get(200));
        System.out.println("The value at the key 300 is: "+table.get(300));
        System.out.println("The value at the key 550 is: "+table.get(550));

        System.out.println();

        System.out.println("The cost to search the node with key 550 is: "+table.search(550));




    }
}
