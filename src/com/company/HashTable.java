package com.company;

public class HashTable<K extends Comparable<K>, V> {
    private NodeHash<K, V>[] hashTable;
    private int nElem;

    //Constructor
    public HashTable() {
        this.hashTable = new NodeHash[200];
        this.nElem = 0;
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
                if(current.key.compareTo(key) == 0){    //Exists
                    current.value = value;
                    break;
                }
                current = current.next;
            }

            if(current == null){
                hashTable[index] = new NodeHash<>(key, value, hashTable[index]);
            }
        }
    }

    //Function for getting the value of a node by passing the key
    public V get(K key){
        int index = key.hashCode() % hashTable.length;

        if(hashTable[index] == null){
            return null;
        }else{
            NodeHash<K,V> current = hashTable[index];
            while (current != null){
                if(current.key.compareTo(key) == 0){
                    return current.value;
                }
                current = current.next;
            }
            return null;
        }
    }

}
