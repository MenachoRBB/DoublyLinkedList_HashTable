package com.company;

public class Ciutada implements Comparable<Ciutada>{
    private String name, surname, dni;

    public Ciutada(String name, String surname, String dni){
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    public String getDni(){
        return dni;
    }

    @Override
    public String toString(){
        return name+" "+surname+" "+dni;
    }

    @Override
    public int compareTo(Ciutada other){
        if(this.dni == other.dni)
            return 0;
        else
            return -1;
    }
}
