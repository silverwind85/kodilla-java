package com.kodilla.testing.forum.statistics;

public class AdvancedStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averageNumberOfPostsPerUser;
    private int averageNumberOfCommentsPerUser;
    private int averageNumberOfCommentsPerPost;

    public AdvancedStatistics(int numberOfUsers, int numberOfPosts, int numberOfComments, int averageNumberOfPostsPerUser, int averageNumberOfCommentsPerUser, int averageNumberOfCommentsPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.averageNumberOfPostsPerUser = averageNumberOfPostsPerUser;
        this.averageNumberOfCommentsPerUser = averageNumberOfCommentsPerUser;
        this.averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost;
    }

    public int calculateNumberOfUsers() {
        return 0;
    }

    public int calculateNumberOfPosts() {
        return 0;
    }

    public int calculateNumberOfComments() {
        return 0;
    }

    public int calculateAverageNumberOfPostsPerUser() {
        return 0;
    }

    public int calculateAverageNumberOfCommentsPerUser() {
        return 0;
    }

    public int calculateAverageNumberOfCommentsPerPost() {
        return 0;
    }
}
