package com.softwareinstitute.training.nur.animalKingdom.animalKingdom;

public class Cat extends Mammal {
    int killCount;

    public Cat(){
        super();
        killCount = 0;
    }

    public void eat(){
        System.out.println("Eating, core.code.Cat");
    }
    public Animal kill(Animal animal){
        killCount++;
        animal.die();
        return animal;
    }

}