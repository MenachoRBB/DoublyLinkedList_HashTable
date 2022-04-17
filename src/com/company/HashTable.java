package com.company;

import java.util.Arrays;

public class HashTable<K extends Comparable<K>, V extends Comparable<V>> {
    private NodeHash[] hashTable;
    private int nElem;
    private double loadFactor;

    //Constructor
    public HashTable(int size) {
        this.hashTable = new NodeHash[size];
        this.nElem = 0;
        loadFactor = 0.75;
    }

    //Add function
    public void add(K key, V value) throws PersonalException {
        if (key == null)
            throw new PersonalException("Key is null");
        else if (value == null)
            throw new PersonalException("Value is null");

        int index = key.hashCode() % hashTable.length;

        if (hashTable[index] == null) {
            hashTable[index] = new NodeHash<>(key, value, null);
            nElem++;
        } else {
            NodeHash temp = hashTable[index];
            while (temp != null) {
                if (temp.key.compareTo(key) == 0) {   //mateixa clau, actualitzem valor
                    temp.value = value;
                    break;
                }
                if (temp.next == null) {
                    temp.next = new NodeHash<>(key, value, hashTable[index]);
                    nElem++;
                }
                temp = temp.next;
            }
        }
    }

    //Function to get a value by passing the key
    public V get(K key) {
        int index = key.hashCode() % hashTable.length;

        if (hashTable[index] == null)
            return null;
        else {
            NodeHash temp = hashTable[index];
            while (temp != null) {
                if (temp.key.compareTo(key) == 0) {
                    return (V) temp.value;
                }
                temp = temp.next;
            }
            return null;
        }
    }

    //Function to get the nElems of the hash table
    public int getnElem() {
        return nElem;
    }


    //Function to remove a node by passing the key
    public void remove(K key) {
        int index = key.hashCode() % hashTable.length;

        if (hashTable[index] == null) {
            return;
        } else {
            NodeHash previous = null;
            NodeHash current = hashTable[index];

            while (current != null) {
                if (current.key.compareTo(key) == 0) {
                    if (previous == null) {
                        hashTable[index] = current.next;
                    } else {
                        previous.next = current.next;
                    }

                    if (hashTable[index] == null) {
                        nElem--;
                    }
                    return;
                }
                previous = current;
                current = current.next;
            }
        }
    }

    //Function that check if an element is at the table
    int search(K key) {
        int i = 0;
        int count = 0;
        for (i = 0; i < hashTable.length; i++) {
            if(hashTable[i] != null){
                while (hashTable[i] != null){
                    System.out.println("The value of the node is: "+hashTable[i].value);
                    if(hashTable[i].key.compareTo(key) != 0){
                        count++;
                    }else{
                        return count+1;
                    }
                    hashTable[i] = hashTable[i].next;
                }
            }
        }
        return count+1;
    }


    //Function that returns the load factor
    double loadFactor(){
        return hashTable.length/nElem;
    }


}
