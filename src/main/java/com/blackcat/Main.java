package com.blackcat;

public class Main {
    public static void main(String[] args) {
        JasmineCat jasmineCat = new JasmineCat();
        jasmineCat.name = "Жасмин";
        jasmineCat.colour = "Черный";
        jasmineCat.breed = "Шотландский скоттиш-фолд";
        jasmineCat.food = "Carmy";
        jasmineCat.age = 15;
        jasmineCat.weight = 4;

        jasmineCat.printName();
        jasmineCat.printColour();
        jasmineCat.printBreed();
        jasmineCat.printFood();
        jasmineCat.printAge();
        jasmineCat.printWeight();
        jasmineCat.printMassIndex();

        HappyDog happyDog = new HappyDog();
        happyDog.name = "Зевс";
        happyDog.colour = "Палевый";
        happyDog.breed = "Лабрадор";
        happyDog.chasingCats = 30;
        happyDog.catsInTheArea = 60;

        happyDog.printName();
        happyDog.printColour();
        happyDog.printBreed();
        happyDog.printCatsInTheArea();
        happyDog.printChasingCats();
        happyDog.printHappyCats();
        happyDog.percentageOfRespect();
    }
}
