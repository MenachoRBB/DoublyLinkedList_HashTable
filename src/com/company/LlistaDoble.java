package com.company;

public class LlistaDoble {
    private Node primer;
    private Node ultim;
    private int nElem;

    //Crear
    public LlistaDoble(){
        primer =  null;
        ultim = null;
        nElem = 0;
    }

    //Inserir el primer element de la llista
    public void inserir(int elem1, int elem2){
        Node nou = new Node(elem1, elem2, null, null);
        if(primer == null){
            primer =  nou;
            ultim = nou;
        }
        //Ara inserim el següent element de la llista
        else if(primer.getSeg() == null){
            //Ordre ascendent
            if(primer.getElem1()<elem1){
                primer.setSeg(nou);
            }else{
                nou.setSeg(primer);
                primer = nou;
            }
            //Ordre descendent desde l'ultim
            if(ultim.getElem2()>elem2){
                ultim.setAnt(nou);
            }else{
                nou.setAnt(ultim);
                ultim = nou;
            }
            //Insertem elements successius
        }else{
            Node actual = primer;
            //com primer element ascendent
            if(primer.getElem1()>elem1){
                nou.setSeg(primer);
                primer = nou;
            }
            else{
                while(actual.getSeg()!=null){
                    if(actual.getSeg().getElem1() > elem1){
                        nou.setSeg(actual.getSeg());
                        actual.setSeg(nou);
                        actual =  nou.getSeg();
                    }else{
                        actual = actual.getSeg();
                    }
                }
                //Com ultim descendent
                if(actual.getAnt() == null && actual.getElem2()>elem2){
                    actual.setAnt(nou);
                }
            }
        }
    }

    public void listar(){
        Node actual =  primer;
        System.out.println("Listar desde el primer");
        while(actual.getSeg() != null){
            System.out.println(actual.getElem1()+"--"+actual.getElem2());
            actual = actual.getSeg();
        }
    }
}
