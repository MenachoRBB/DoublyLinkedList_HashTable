package com.company;

public class HashTable<K extends Comparable<K>, V> {
    private NodeHash<K,V>[] hashTable;
    private int nElem;
    private double loadFactor;

    //Constructor
    public HashTable() {
        this.hashTable = new NodeHash[3];
        this.nElem = 0;
        loadFactor = 0.75;
    }

    //Function for adding new values at the hash table
    public void add(K key, V value) {
        int index = key.hashCode() % hashTable.length; //Hash function

        if(hashTable[index] == null){   //Empty
            hashTable[index] = new NodeHash<>(key, value, null);
            nElem++;
        }else{  //There's sth in that index
            NodeHash<K,V> current = this.hashTable[index];
            while(current != null){
                if(current.key.compareTo(key) == 0){    //Exists, update the value
                    current.value = value;
                    break;
                }
                current = current.next;
            }

            if(current == null){
                hashTable[index] = new NodeHash<>(key, value, hashTable[index]);
                nElem++;
            }
        }
    }

    //Function for getting the value of a node by passing the key
    public V get(K key){
        int index = key.hashCode() % hashTable.length;

        if (hashTable[index] != null) {
            NodeHash<K, V> current = hashTable[index];
            while (current != null) {
                if (current.key.compareTo(key) == 0) {
                    return current.value;
                }
                current = current.next;
            }
        }
        return null;
    }

    //Return the number of elements that there are added at the table
    public int tableLength(){
        return nElem;
    }

    //Remove the node specified by passing the key
    public void remove(K key){
        int index = key.hashCode() % hashTable.length;

        if(hashTable[index] == null){   //Empty pos at the table
            return;
        }else{
            NodeHash<K,V> previous = null;
            NodeHash<K,V> current = hashTable[index];

            while(current != null){
                if(current.key.compareTo(key) == 0){
                    if(previous == null){
                        hashTable[index] = current.next; //Deletes the 1st node of the position
                    }else{
                        previous.next = current.next;    //Don't delete the 1st node of the position
                    }

                    if(hashTable[index] == null){   //There are elements that they have been deleted
                        this.nElem--;
                    }
                    return;
                }//Rearrange the collisions
                previous = current;
                current = current.next;
            }
        }
    }

    //Returns the load factor
    public float loadFactor(){
        return nElem/hashTable.length;
    }

}
