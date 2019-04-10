package com.example.app;

public class Fish extends Animal{

    private int gils;
    private int eyes;
    private int fins;



    public Fish(String name, int size, int weight, int gils, int eyes, int fins) {
        
        super(name,1,1,size, weight);
        this.gils = gils;
        this.eyes = eyes;
        this.fins = fins;
    }
    

    public void rest(){

    }
    
    public void moveMuscles(){

    }

    public void moveBackFin(){

    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
    
}