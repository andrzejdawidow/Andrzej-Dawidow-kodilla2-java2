package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User alice = new Millenials("Alice Smith");
        User david = new YGeneration("David Stone");
        User mike = new ZGeneration("Mike Amber");
        //When
        String aliceChoice = alice.sharePost();
        System.out.println("Alice chose: " + aliceChoice);
        String davidChoice = david.sharePost();
        System.out.println("David chose: " + davidChoice);
        String mikeChoice = mike.sharePost();
        System.out.println("Mike chose: " + mikeChoice);
        //Then
        Assert.assertEquals("[Facebook]", aliceChoice);
        Assert.assertEquals("[Snapchat]", davidChoice);
        Assert.assertEquals("[Twitter]", mikeChoice);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User alice = new Millenials("Alice Smith");
        //When
        String aliceChoice = alice.sharePost();
        System.out.println("Alice chose: " + aliceChoice);
        alice.setSocialNetwork(new TwitterPublisher());
        aliceChoice = alice.sharePost();
        System.out.println("Now Alice chose: " + aliceChoice);
        //Then
        Assert.assertEquals("[Twitter]", aliceChoice);
    }
}
