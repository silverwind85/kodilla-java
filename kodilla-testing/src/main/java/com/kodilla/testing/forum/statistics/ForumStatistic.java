package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averageNumberOfPostsPerUser;
    private int averageNumberOfCommentsPerUser;
    private int averageNumberOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
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
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers==0){
            averageNumberOfPostsPerUser=0;
        }else{
            averageNumberOfPostsPerUser = numberOfPosts/numberOfUsers;
        }
        if(numberOfUsers==0){
            averageNumberOfCommentsPerUser = 0;
        }else{
            averageNumberOfCommentsPerUser = numberOfComments/numberOfUsers;
        }
        if(numberOfPosts==0){
            averageNumberOfCommentsPerPost = 0;
        }else {
            averageNumberOfCommentsPerPost = numberOfComments/numberOfPosts;
        }
    }

    @Override
    public String toString() {
        return "ForumStatistic{" +
                "numberOfUsers=" + numberOfUsers +
                ", numberOfPosts=" + numberOfPosts +
                ", numberOfComments=" + numberOfComments +
                ", averageNumberOfPostsPerUser=" + averageNumberOfPostsPerUser +
                ", averageNumberOfCommentsPerUser=" + averageNumberOfCommentsPerUser +
                ", averageNumberOfCommentsPerPost=" + averageNumberOfCommentsPerPost +
                '}';
    }
    public void showStatistic() {
        toString();

    }
}
