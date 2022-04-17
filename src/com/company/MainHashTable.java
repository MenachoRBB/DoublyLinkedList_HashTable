package com.company;

public class MainHashTable {
    public static void main(String[] args){

        HashTable<Integer, String> table = new HashTable<>();

        int key = 100;
        String value = "200";

        table.add(key, value);
        table.add(120, "ivan");
        table.add(50, "joel");
        table.add(60, "adri");
        table.add(40, "juan");
        table.add(55, "montse");
        table.add(70, "test");

        table.remove(key);
        table.remove(120);
        table.remove(50);
        table.remove(60);
        table.remove(40);
        table.remove(55);
        table.remove(70);


        System.out.println("The value at the index of the key 100 is: "+table.get(key));//It works
        System.out.println("The value at the index of the key 120 is: "+table.get(120));//It works
        System.out.println("The value at the index of the key 50 is: "+table.get(50));//It works
        System.out.println("The value at the index of the key 100 is: "+table.get(60));//It works
        System.out.println("The value at the index of the key 100 is: "+table.get(40));//It works
        System.out.println("The value at the index of the key 100 is: "+table.get(55));//It works

        System.out.println("The table length is: "+table.tableLength());
    }
}
