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
        shopping.executeTask();
        //Then
        Assert.assertEquals("shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }
    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        //Then
        Assert.assertEquals("painting", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //Then
        Assert.assertEquals("driving", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
