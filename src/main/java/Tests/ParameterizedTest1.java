package main.java.Tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParameterizedTest1 {

    @Parameters({"myName"})
    @Test
    public void howmanywordsinStringwithdata(@Optional("Kate Kate Kate ")String myName) {
        int actualAmount = myName.split(" ").length;
        int expectedAmount = 3;
        assertEquals(
                actualAmount,
                expectedAmount,
                "Expected amount of users to be " + expectedAmount + " but got " + actualAmount
        );

    }
}