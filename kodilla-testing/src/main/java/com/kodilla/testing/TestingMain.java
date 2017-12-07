package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int result1 = calculator.add(6, 4);
        int result2 = calculator.subtract(6, 4);
        System.out.println(result1);
        System.out.println(result2);
        if ((result1 == 10) && (result2 == 2)) {
            System.out.println("Calculator is OK");
        } else {
            System.out.println("Something is Wrong");
        }
    }
}
