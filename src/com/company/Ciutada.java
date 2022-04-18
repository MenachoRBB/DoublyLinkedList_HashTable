package com.company;

public class Ciutada implements Comparable<Ciutada>{
    private final String name, surname, dni;

    public Ciutada(String name, String surname, String dni){
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    @Override
    public String toString(){
        return name+" "+surname+" "+dni;
    }

    @Override
    public int compareTo(Ciutada other){
        if(this.dni.equals(other.dni))
            return 0;
        else
            return -1;
    }

    public String getDni(){
        return dni;
    }
}
