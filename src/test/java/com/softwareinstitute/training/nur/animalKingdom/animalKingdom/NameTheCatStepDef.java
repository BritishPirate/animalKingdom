package com.softwareinstitute.training.nur.animalKingdom.animalKingdom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class NameTheCatStepDef {

    Cat cat;
    String name;
    boolean owner;

    @Given("I have a cat")
    public void i_have_a_cat(){
        cat = new Cat();
    }


    @Given("The cat does not have a name")
    public void the_cat_doesnt_hav_a_name() {
        cat.setName("");
    }


    @Given("I am the owner")
    public void i_am_the_owner() {
        owner = true;
    }

    @Given("The name I want to give it is Dave")
    public void the_name_I_want_to_give_it_is_Dave() {
        name = "Dave";
    }

    @When("I name the cat")
    public void i_name_the_cat(){
        cat.name(name, owner);
    }

    @Then("The cat is called Dave")
    public void the_cat_is_called_Dave(){
        Assertions.assertEquals("Dave", cat.getName());
    }

    @And("it answers to it's name")
    public void it_answers_to_its_name(){
        Assertions.assertEquals(true, cat.call(name));
    }

}
