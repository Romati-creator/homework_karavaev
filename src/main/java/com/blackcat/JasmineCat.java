package com.blackcat;

public class JasmineCat {
    String colour;
    String breed;
    String feed;
    String name;
    int age;
    int weight;


    public void nameCat() {
        System.out.println(name);
    }

    public void colourCat() {
        System.out.println(colour);
    }

    public void breedCat(){
        System.out.println(breed);
    }

    public void feedCat(){
        System.out.println(feed);
    }

    public void ageCat(){
        System.out.println(age);
    }

    public void weightCat(){
        System.out.println(weight);
    }

    public void massIndex(){
        var x = ((age - weight) * (age + weight));
        if (x >= 50) {
            System.out.println("Твоей кошке необходимо немного похудеть!");}
        else {
            System.out.println("Твоя кошка идеальна!");
        }
    }
}
