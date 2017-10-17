package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    // user = 100 post = 0 comments = 0
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        int postCountMock = 0;
        int commentsCountMock = 0;
        for (int i = 0; i < 100; i++) {
            users.add("John Smith");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost());
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPostsPerUser());
    }

    @Test
    // user = 0 post = 1000 comments = 0 comments < post
    public void testSecondCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        int postCountMock = 1000;
        int commentsCountMock = 0;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost());
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPostsPerUser());
    }

    @Test
    // comments > post
    public void testThirdCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("John Smith");
        }
        int postCountMock = 500;
        int commentsCountMock = 1000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, forumStatistic.getAverageNumberOfCommentsPerPost());
        Assert.assertEquals(10, forumStatistic.getAverageNumberOfCommentsPerUser());
        Assert.assertEquals(5, forumStatistic.getAverageNumberOfPostsPerUser());
    }
}
