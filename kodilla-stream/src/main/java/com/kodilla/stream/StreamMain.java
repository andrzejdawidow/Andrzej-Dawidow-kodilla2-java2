package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String someTekst1 = poemBeautifier.beautify("number1", a -> "super1 + " + a + " + super2");

        System.out.println();
        System.out.println(someTekst1);

        String someTekst2 = poemBeautifier.beautify("number2", a -> a + " " + a.toUpperCase());
        System.out.println();
        System.out.println(someTekst2);

        String someTekst3 = poemBeautifier.beautify("number3", a -> "***" + a + "***");
        System.out.println();
        System.out.println(someTekst3);

        String someTekst4 = poemBeautifier.beautify("number4", a -> "#A#B#C#" + a + "#A#B#C#");
        System.out.println();
        System.out.println(someTekst4);
    }
}
