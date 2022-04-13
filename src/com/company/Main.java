package com.company;
public class Main {

    public static void main(String[] args){
        //Constructor de la llista
	    DoublyLinkedList<Ciutada> list = new DoublyLinkedList<>();

        //Creació dels elements de la llista
        Ciutada test1 = new Ciutada("Ivan", "Menacho", "48275497S"); //Mateix DNI que Joel
        Ciutada test2 = new Ciutada("Joel", "Marti", "48275497S");  //Mateix DNI que Iván
        Ciutada test3 = new Ciutada("Antonio", "Matas", "46275497S");
        Ciutada test4 = new Ciutada("Ivan", "Gonzalez", "45275497S");
        Ciutada test5 = new Ciutada("Josema", "Ramos", "44275497S");
        Ciutada test6 = new Ciutada("Adria", "Chipre", "43275497S");
        Ciutada test7 = new Ciutada("Adrian", "Izquierdo", "42275497S");
        Ciutada test8 = new Ciutada("Juan", "Menacho", "41275497S");
        Ciutada test9 = new Ciutada("Montse", "Dominguez", "40275497S");
        Ciutada test10 = new Ciutada("Patri", "Menacho", "49275497S");

        list.addNode(test1);
        list.addNode(test2);
        list.addNode(test3);
        list.addNode(test4);
        list.addNode(test5);
        list.addNode(test6);
        list.addNode(test7);
        list.addNode(test8);
        list.addNode(test9);
        //list.addNode(test10); Aquest l'afegirem més tard en una posició concreta per comprovar que funciona
        //Mostrem la llista per consola
        list.showAll(list);

        try{
            //Afegim el ciutadà a la posició número 3
            list.addNodePos(3, test10);
        }catch(PersonalException e){
            System.err.println("No s'ha pogut afegir");
        }

        //Utilitzem la funció obtenir per veure si a la 3ra posició s'ha afegit la Patri correctament, primer salt de linia perque quedi més clar
        try {
            System.out.println(list.getNode(3));
        }catch(PersonalException e){
            System.err.println("No s'ha pogut obtenir la posició");
        }
        //Efectivament s'haura afegit a la tercera posició
        //Ara l'afegirem pero a una posició inexistent perque sali l'excepció
        try{
            //Afegim el ciutadà a la posició número 15, que es mes gran del nombre d'elements
            list.addNodePos(15, test10);
        }catch(PersonalException e){
            System.err.println("No s'ha pogut afegir");
            //Salta l'excepció, ho controla correctament
        }

        //Ara intentarem obtenir una posició de la llista inexistent, com la posició -5
        try{
            System.out.println(list.getNode(-5));
        }catch(PersonalException e){
            System.err.println("No s'ha pogut obtenir la posició");
        }
        //En aquest cas saltarà l'excepció
        //Ara obtindrem la longitud de la llista, que en aquest cas hauria de ser 10, ja que estan afegits tots els ciutadans.
        System.out.println("La longitud de la llista es de: "+list.listLength()+" elements"); //Funciona correctament

        //Ara esborrarem de la llista a la Patri, que era a la posició 3 si recordem
        try {
            list.deleteNodeAtGivenPos(3);
        }catch(PersonalException e){
            System.err.println("No es pot esborrar en aquesta posicio");
        }
        //Imprimim la llista i ens sortirà que ja no hi és i que la longitud de la llista serà de 9 elements
        list.showAll(list);
        System.out.println("La longitud de la llista es de: "+list.listLength()+" elements"); //Funciona correctament

        //Ara guardarem en una variable unes dades, i les passarem a la funció de buscar per veure si existeix algun element de la llista
        //amb les dades introduides
        Ciutada dadesTest = new Ciutada("test", "test", "dniTest");
        try{
            System.out.println("Les dades es troben a la posició: "+list.search(dadesTest));
        }catch(PersonalException e){
            System.err.println("Les dades no es troben a la llista");
        }
        //Donara error ja que les dades no son a la llista, pero si probem amb un ciutada afegit abans podrem veure que si ens dona resultat.
        try{
            System.out.println("Les dades es troben a la posició: "+list.search(test4));
        }catch(PersonalException e){
            System.err.println("Les dades no es troben a la llista");
        }

        //Finalment compararem dos ciutadans per veure si són el mateix, en aquest cas, si els DNI són els mateixos, seran el mateix.
        //Si la funció en retorna 0, són el mateix DNI, si retorna -1 vol dir que tenen DNI diferents.
        //Primer probarem amb l'Iván i el Joel, que tenen el mateix DNI i hauria de retornar 0
        System.out.println("Comparacio DNI Iván i Joel: "+test1.compareTo(test2)); //Retorna 0 són iguals
        //Ara probarem amb l'Iván i la Patri, que com tenen DNI diferents, haura de retornar -1
        System.out.println("Comparacio DNI Iván i Patri: "+test1.compareTo(test10));//Retorna -1, són diferents
    }
}
