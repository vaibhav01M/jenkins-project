package com.test.bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleStepDefinitions {

    @Given("I launch the application")
    public void iLaunchTheApplication() {
        System.out.println("Application launched");
    }

    @When("I perform an action")
    public void iPerformAnAction() {
        System.out.println("Action performed");
    }

    @Then("I verify the result")
    public void iVerifyTheResult() {
        System.out.println("Result verified");
    }
}

