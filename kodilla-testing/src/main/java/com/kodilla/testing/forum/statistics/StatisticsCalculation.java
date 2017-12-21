package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
   private int numberOfUser = 0;
   private int numberOfPosts = 0;
   private int numberOfComments = 0;
   private int averageNumberOfPostsPerUser = 0;
   private  int averageNumberOfCommentsPerUser = 0;
   private int averageNumberOfCommentsPerPost = 0;

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public int getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public int getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUser = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUser == 0) {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = 0;
            averageNumberOfCommentsPerPost = 0;
        } else {
            if (numberOfPosts == 0) {
                averageNumberOfPostsPerUser = numberOfPosts / numberOfUser;
                averageNumberOfCommentsPerUser = numberOfComments / numberOfUser;
                averageNumberOfCommentsPerPost = 0;
            } else {
                averageNumberOfPostsPerUser = numberOfPosts / numberOfUser;
                averageNumberOfCommentsPerUser = numberOfComments / numberOfUser;
                averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;
            }
         }
    }

    public void showStatistics() {

    }
}
