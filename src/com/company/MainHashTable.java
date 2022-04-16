package com.company;

public class MainHashTable {
    public static void main(String[] args){

        HashTable<Integer, String> table = new HashTable<>();

        int key = 100;
        String value = "200";

        table.add(key, value);

        System.out.println("The value at the index of the key 100 is: "+table.get(key));//It works
    }
}
