package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static junit.framework.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        ForumTopic javaHelpForum = new JavaToolsForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser marryBean = new ForumUser("Marry Bean");
        ForumUser kateParry = new ForumUser("Kate Parry");

        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(marryBean);
        javaHelpForum.registerObserver(kateParry);
        javaToolsForum.registerObserver(johnSmith);

        javaToolsForum.addPost("Hello everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Setter try to use while loop in this case");
        javaHelpForum.addPost("Help pls, my Mysql db doesn't want to work:");
        javaToolsForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.");

        assertEquals(5,johnSmith.getUpdatCount());
        assertEquals(2,marryBean.getUpdatCount());
        assertEquals(2,kateParry.getUpdatCount());
    }
}
