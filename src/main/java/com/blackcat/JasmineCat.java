package com.blackcat;

public class JasmineCat {
    String colour;
    String breed;
    String food;
    String name;
    int age;
    int weight;


    public void printName() {
        System.out.println(name);
    }

    public void printColour() {
        System.out.println(colour);
    }

    public void printBreed(){
        System.out.println(breed);
    }

    public void printFood(){
        System.out.println(food);
    }

    public void printAge(){
        System.out.println(age);
    }

    public void printWeight(){
        System.out.println(weight);
    }

    public void printMassIndex(){
        int x = ((age - weight) * (age + weight));
        if (x >= 50) {
            System.out.println("Твоей кошке необходимо немного похудеть!\n");}
        else {
            System.out.println("Твоя кошка идеальна!\n");
        }
    }
}
