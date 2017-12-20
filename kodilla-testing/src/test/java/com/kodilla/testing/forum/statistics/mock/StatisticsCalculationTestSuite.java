package com.kodilla.testing.forum.statistics.mock;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculation;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculationTestSuite {
    //test 1
    @Test
    public void testCalculateAdvStatisticsWithMockWithPostsZero() {
        //Given
        ArrayList<String> listOfUsers = new ArrayList<>();
        listOfUsers.add("Andrew");
        listOfUsers.add("John");
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(2);
        //When
        StatisticsCalculation calculations = new StatisticsCalculation();
        calculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, calculations.getNumberOfUser());
        Assert.assertEquals(0, calculations.getNumberOfPosts());
        Assert.assertEquals(2, calculations.getNumberOfComments());
        Assert.assertEquals(0, calculations.getAverageNumberOfPostsPerUser());
        Assert.assertEquals(1, calculations.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(0, calculations.getAverageNumberOfCommentsPerPost());
    }
    //test 2
    @Test
    public void testCalculateAdvStatisticsWithMockWithPostsOneThousand() {
        //Given
        ArrayList<String> listOfUsers = new ArrayList<>();
        listOfUsers.add("Andrew");
        listOfUsers.add("John");
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(12);
        //When
        StatisticsCalculation calculations = new StatisticsCalculation();
        calculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, calculations.getNumberOfUser());
        Assert.assertEquals(1000, calculations.getNumberOfPosts());
        Assert.assertEquals(12, calculations.getNumberOfComments());
        Assert.assertEquals(500, calculations.getAverageNumberOfPostsPerUser());
        Assert.assertEquals(6, calculations.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(0, calculations.getAverageNumberOfCommentsPerPost());
    }
    //test 3
    @Test
    public void testCalculateAdvStatisticsWithMockWithCommentsZero() {
        //Given
        ArrayList<String> listOfUsers = new ArrayList<>();
        listOfUsers.add("Andrew");
        listOfUsers.add("John");
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        StatisticsCalculation calculations = new StatisticsCalculation();
        calculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, calculations.getNumberOfUser());
        Assert.assertEquals(2, calculations.getNumberOfPosts());
        Assert.assertEquals(0, calculations.getNumberOfComments());
        Assert.assertEquals(1, calculations.getAverageNumberOfPostsPerUser());
        Assert.assertEquals(0, calculations.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(0, calculations.getAverageNumberOfCommentsPerPost());
    }
    //test 4
    @Test
    public void testCalculateAdvStatisticsWithMockWithCommentsLessThanPosts() {
        //Given
        ArrayList<String> listOfUsers = new ArrayList<>();
        listOfUsers.add("Andrew");
        listOfUsers.add("John");
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(6);
        when(statisticsMock.commentsCount()).thenReturn(12);
        //When
        StatisticsCalculation calculations = new StatisticsCalculation();
        calculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, calculations.getNumberOfUser());
        Assert.assertEquals(6, calculations.getNumberOfPosts());
        Assert.assertEquals(12, calculations.getNumberOfComments());
        Assert.assertEquals(3, calculations.getAverageNumberOfPostsPerUser());
        Assert.assertEquals(6, calculations.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(2, calculations.getAverageNumberOfCommentsPerPost());
    }
    //test 5
    @Test
    public void testCalculateAdvStatisticsWithMockWithMoreCommentsThanPosts() {
        //Given
        ArrayList<String> listOfUsers = new ArrayList<>();
        listOfUsers.add("Andrew");
        listOfUsers.add("John");
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(12);
        when(statisticsMock.commentsCount()).thenReturn(6);
        //When
        StatisticsCalculation calculations = new StatisticsCalculation();
        calculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, calculations.getNumberOfUser());
        Assert.assertEquals(12, calculations.getNumberOfPosts());
        Assert.assertEquals(6, calculations.getNumberOfComments());
        Assert.assertEquals(6, calculations.getAverageNumberOfPostsPerUser());
        Assert.assertEquals(3, calculations.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(0, calculations.getAverageNumberOfCommentsPerPost());
    }
    //test 6
    @Test
    public void testCalculateAdvStatisticsWithMockWithUsersZero() {
        //Given
        ArrayList<String> listOfUsers = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        StatisticsCalculation calculations = new StatisticsCalculation();
        calculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, calculations.getNumberOfUser());
        Assert.assertEquals(0, calculations.getNumberOfPosts());
        Assert.assertEquals(0, calculations.getNumberOfComments());
        Assert.assertEquals(0, calculations.getAverageNumberOfPostsPerUser());
        Assert.assertEquals(0, calculations.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(0, calculations.getAverageNumberOfCommentsPerPost());
    }
    //test 7
    @Test
    public void testCalculateAdvStatisticsWithMockWithUsersOneHundred() {
        //Given
        ArrayList<String> listOfUsers = new ArrayList<>();
            for (int n = 0; n <100; n++) {
                listOfUsers.add("Andrew");
            }
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(600);
        when(statisticsMock.commentsCount()).thenReturn(1200);
        //When
        StatisticsCalculation calculations = new StatisticsCalculation();
        calculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, calculations.getNumberOfUser());
        Assert.assertEquals(600, calculations.getNumberOfPosts());
        Assert.assertEquals(1200, calculations.getNumberOfComments());
        Assert.assertEquals(6, calculations.getAverageNumberOfPostsPerUser());
        Assert.assertEquals(12, calculations.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(2, calculations.getAverageNumberOfCommentsPerPost());
    }
}
