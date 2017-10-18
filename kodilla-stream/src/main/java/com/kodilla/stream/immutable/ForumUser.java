package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String name;
    private final String realName;
    private final int posts ;
    private final int comments ;

    public ForumUser(final String name, final String realName, final int posts, final int comments) {
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
