package com.softwareinstitute.training.nur.animalKingdom.animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    List<Animal> AnimalList = new ArrayList();

    public AnimalList(){
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
        AnimalList.add(new Cat());
    }

    public List<Animal> getAnimalList() {
        return AnimalList;
    }
    @Override
    public String toString(){
        return "";
    }
}
