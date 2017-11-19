package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    private SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }
    public String sharePost(){
        return socialPublisher.share();
    }
    public void setSocialMedia(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

}
