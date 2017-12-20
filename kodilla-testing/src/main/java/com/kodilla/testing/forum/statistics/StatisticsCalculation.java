package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
   private int numberOfUser;
   private int numberOfPosts;
   private int numberOfComments;
   private int averageNumberOfPostsPerUser;
   private  int averageNumberOfCommentsPerUser;
   private int averageNumberOfCommentsPerPost;

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
            numberOfPosts = 0;
            numberOfComments = 0;
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
