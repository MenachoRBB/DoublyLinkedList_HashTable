package com.company;

import java.awt.desktop.SystemSleepEvent;

public class MainHashTable {
    public static void main(String[] args){

        //Creació de la taula
        HashTable<String, Ciutada> table = new HashTable<>(3);

        //Creacio dels ciutadans
        Ciutada test1 = new Ciutada("Antonio", "Rodriguez", "48275497S");
        Ciutada test2 = new Ciutada("Juan", "Martin", "48275497S");
        Ciutada test3 = new Ciutada("Nuria", "Quesada", "46275497S");
        Ciutada test4 = new Ciutada("Paula", "Gonzalez", "45275497S");
        Ciutada test5 = new Ciutada("Mireia", "Ramos", "44275497S");
        Ciutada test6 = new Ciutada("Xavi", "Chipre", "43275497S");
        Ciutada test7 = new Ciutada("Jose", "Izquierdo", "42275497S");
        Ciutada test8 = new Ciutada("Miguel", "Hernandez", "42005497S");

        //Insercio dels ciutadans amb excepció, una clau es nula, salta excepció
        try {
            table.add(null, test1);
        }catch (PersonalException e){
            System.err.println(e);
        }

        //Insercio dels ciutadans amb excepció, un valor es nul, salta excepció
        try {
            table.add(test1.getDni(), null);
        }catch (PersonalException e){
            System.err.println(e);
        }

        //Inserció correcta dels ciutadans sense que salti l'excepcio
        try{
            table.add(test1.getDni(), test1);
            table.add(test2.getDni(), test2);
            table.add(test3.getDni(), test3);
            table.add(test4.getDni(), test4);
            table.add(test5.getDni(), test5);
            table.add(test6.getDni(), test6);
            table.add(test7.getDni(), test7);
            //Afegim un altre amb la clau del DNI de test1 per comprovar que actualitzem el valor
            table.add(test1.getDni(), test8);
        }catch (PersonalException e){
            System.err.println(e);
        }

        //Si ara obtenim el valor de la clau del DNI de test1, veurem que el valor es test7 i no test1, es a dir
        //Miguel Hernandez, no Antonio Rodriguez
        try{
            System.out.println("El valor de la clau del DNI del test1 és: "+table.get(test1.getDni()));
        }catch (PersonalException e){
            System.err.println(e);
        }

        //Ara si debuguessim veuriem per quants nodes hem de passar abans de arribar al que volem
        try {
            System.out.println("El numero de nodes per el que s'ha de passar per trobar test4 es: "+table.search(test4.getDni()));
        }catch(PersonalException e){
            System.err.println(e);
        }

        //La mida actual de la taula es 6 ja que hem actuializat un, no hem afegit 7
        System.out.println("La mida de la taula es: "+table.getnElem());
        //Si esborrem un, hauria de baixar a 5
        try{
            table.remove(test1.getDni());
        }catch (PersonalException e){
            System.err.println(e);
        }

        System.out.println("La mida de la taula ara es de: "+table.getnElem());

        //Ara podem obtenir el factor de carrega, en aquest superior a 1 ja que hi ha mes elements
        //que posicions a la taula, perque s'han emmagatzemat en colisions
        System.out.println("El factor de carrega es de: "+table.loadFactor());

        //Ara creem les dues llistes doblement enllaçades de la part 1.1 i les mostrem amb les seves funcions
        DoublyLinkedList claus = table.getKeys();
        DoublyLinkedList valors = table.getValues();

        System.out.println();
        System.out.println("Claus: ");
        claus.showAll(claus);
        System.out.println();
        System.out.println("Valors: ");
        valors.showAll(valors);
    }
}
