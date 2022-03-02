package com.company;

public class Main {

    public static void main(String[] args) {
	    LlistaDoble llista = new LlistaDoble();

        llista.inserir(1,2);
        //Los siguientes no sirven porque la funcion inserir solo añade uno
        llista.inserir(3,4);
        llista.inserir(5,6);
        llista.inserir(7,8);

        llista.listar();
    }
}
