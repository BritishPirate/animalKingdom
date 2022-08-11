package com.softwareinstitute.training.nur.animalKingdom.animalKingdom;

import com.softwareinstitute.training.nur.animalKingdom.animalKingdom.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

 //
    @Test
    public void test_Animal_Die(){
        Cat cat = new Cat();
        cat.die();
        Assertions.assertFalse(cat.isAlive());
    }

    @Test
    public void test_Animal_Breed(){
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Animal baby = cat1.breed(cat2);
        Assertions.assertEquals(baby, new Cat());
    }
}