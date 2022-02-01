package com.blackcat;

public class HappyDog {
    String name;
    String colour;
    String breed;
    int chasingCats;
    int catsInTheArea;
    int percentageOfRespect;

    public void printName() {
        System.out.println(name);
    }

    public void printColour() {
        System.out.println(colour);
    }

    public void printBreed(){
        System.out.println(breed);
    }

    public void printCatsInTheArea(){
        System.out.println(catsInTheArea);
    }

    public void printChasingCats(){
        System.out.println(chasingCats);
    }

    public void printHappyCats(){
        int x = (catsInTheArea - chasingCats);
        if (x >= 30) {
            System.out.println("Твой пес напугал слишком мало котов!");}
        else {
            System.out.println("Твой пес напугал достаточно котов!");
        }
    }
    public void percentageOfRespect(){
        int x = (chasingCats / catsInTheArea * 100);
        if (x >= 50) {
            System.out.println("Твой пес настоящий авторитет!");}
        else {
            System.out.println("Уважение твоего пса на районе надо подтянуть!");
        }
    }
}
