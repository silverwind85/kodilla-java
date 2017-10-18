package com.kodilla.stream.immutable;

public final class ForumUser {
    private String name;
    private String realName;
    private int posts ;
    private int comments ;

    public ForumUser(String name, String realName, int posts, int comments) {
        this.name = name;
        this.realName = realName;
        this.posts = posts;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }
}
