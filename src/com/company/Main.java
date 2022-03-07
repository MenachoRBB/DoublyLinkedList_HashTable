package com.company;

public class Main {

    public static void main(String[] args) {
	    LlistaDoble<Integer> list = new LlistaDoble();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        list.showAll();
    }
}
