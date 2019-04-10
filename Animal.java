package com.example.app;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    public Animal() {
    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return this.brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return this.body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animal name(String name) {
        this.name = name;
        return this;
    }

    public Animal brain(int brain) {
        this.brain = brain;
        return this;
    }

    public Animal body(int body) {
        this.body = body;
        return this;
    }

    public Animal size(int size) {
        this.size = size;
        return this;
    }

    public Animal weight(int weight) {
        this.weight = weight;
        return this;
    }

}