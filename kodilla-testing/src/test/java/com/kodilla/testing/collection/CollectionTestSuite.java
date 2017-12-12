package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyCollection = new ArrayList<>();
        //When
        OddNumbersExterminator result = new OddNumbersExterminator();
        List<Integer> maybeEmpty =  result.exterminate(emptyCollection);
        //Then
        Assert.assertEquals(emptyCollection, maybeEmpty);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> differentNumbers = new ArrayList<>();
        differentNumbers.add(2);
        differentNumbers.add(4);
        differentNumbers.add(6);
        differentNumbers.add(9);
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        //When
        OddNumbersExterminator result = new OddNumbersExterminator();
        List<Integer> afterElimination =  result.exterminate(differentNumbers);
        //Then
        Assert.assertEquals(afterElimination, evenNumbers);
    }
}