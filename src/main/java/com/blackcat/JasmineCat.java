package com.blackcat;

public class JasmineCat {
    String colour;
    String breed;
    String feed;
    String name;
    int age;
    int weight;
    int chest;
    int pawLehgth;
    int x;

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
        x = (int) ((chest / 0.7062 - pawLehgth) / 0.9156 - pawLehgth);
        if (x > 10) {
            System.out.println("Твоей кошке необходимо немного похудеть!");}
        else {
            System.out.println("Твоя кошка идеальна!");
        }
    }
}
