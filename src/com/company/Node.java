package com.company;

public class Node {
    private int elem1;
    private int elem2;
    private Node seg;
    private Node ant;

    public Node(int elem1, int elem2, Node seg, Node ant){
        this.elem1 =  elem1;
        this.elem2 = elem2;
        this.seg = seg;
        this.ant = ant;
    }

    public int getElem1(){
        return elem1;
    }

    public int getElem2(){
        return elem2;
    }

    public Node getSeg(){
        return seg;
    }

    public Node getAnt(){
        return ant;
    }

    public void setElem1(int e){
        elem1 = e;
    }

    public void setElem2(int e){
        elem2 = e;
    }

    public void setSeg(Node n){
        seg = n;
    }

    public void setAnt(Node n){
        ant = n;
    }


}
