package com.company;

public class CostComputacional {
    public static void main(String[] args) throws PersonalException{
        for(int size = 2000; size < 50001; size = size + 2000){
            DoublyLinkedList<Integer> llista = new DoublyLinkedList<>();
            HashTable<Integer,Integer> taula = new HashTable<>(size);

            int[] num = new int[size];
            for(int i = 0; i < taula.getSize(); i++){
                num[i] = (int) Math.floor(Math.random()* taula.getSize()/2+1);
                taula.add(num[i], num[i]);
                llista.addNode(num[i]);
            }
            long mitjanaLlista;
            long mitjanaTaula;
            long totalLlista = 0;
            long totalTaula = 0;
            for(int i = 0; i < taula.getSize(); i++){
                totalTaula += taula.search(num[i]);
                totalLlista += llista.search(num[i]);
            }
            mitjanaLlista = totalLlista / taula.getSize();
            mitjanaTaula = totalTaula / taula.getSize();
            System.out.println("Mida llista: "+size+", mitjana llista: "+mitjanaLlista);
            System.out.println("Mida taula: "+size+", mitjana taula: "+mitjanaTaula);
        }

    }
}
