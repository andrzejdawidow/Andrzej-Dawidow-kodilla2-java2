package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("shopping", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
    }
    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("painting", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("driving", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
    }
}
