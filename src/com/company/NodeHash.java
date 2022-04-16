package com.company;

public class NodeHash<K extends Comparable<K>, V> {
    K key;
    V value;
    NodeHash<K, V> next;

    public NodeHash(K key, V value, NodeHash<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
