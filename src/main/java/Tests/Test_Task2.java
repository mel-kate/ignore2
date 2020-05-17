package main.java.Tests;



import main.java.Task2;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test_Task2 {
    Task2 task2;

    @Test
    public void howmanywordsinString() {
        task2 = new Task2();
        String names = task2.main();
        int actualAmount = names.split(" ").length;
        int expectedAmount = 51;
        assertEquals(
                actualAmount,
                expectedAmount,
                "Expected amount of users to be " + expectedAmount + " but got " + actualAmount
        );

    }

    @Test
    public void UpperCase() {
        String[] usersNames = task2.main().split(" ");
        for (String name : usersNames) {
            String actualFirstChar = String.valueOf(name.charAt(0)); //v
            String expectedFirstChar = String.valueOf(name.charAt(0)).toUpperCase();
            assertTrue(
                    actualFirstChar.equals(expectedFirstChar),
                    "Expected fist char " + actualFirstChar + " in name " + name + " to be upper case."
            );
        }
    }


}
