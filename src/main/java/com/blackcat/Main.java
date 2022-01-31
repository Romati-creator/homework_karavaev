package com.blackcat;

public class Main {
    public static void main(String[] args) {
        JasmineCat jasmineCat = new JasmineCat();
        jasmineCat.name = "Жасмин";
        jasmineCat.colour = "Черный";
        jasmineCat.breed = "Шотландский скоттиш-фолд";
        jasmineCat.feed = "Carmy";
        jasmineCat.age = 15;
        jasmineCat.weight = 4;


        jasmineCat.nameCat();
        jasmineCat.colourCat();
        jasmineCat.breedCat();
        jasmineCat.feedCat();
        jasmineCat.ageCat();
        jasmineCat.weightCat();
        jasmineCat.massIndex();

    }
}
