package com.kodilla.pattern.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User mark = new Millenials("Mark Milenium");
        User violetta = new YGeneration("Violetta Smith");
        User kris = new ZGeneration("Kris Fey");
        //When
        System.out.println("Mark use: "+mark.sharePost());
        System.out.println("Violetta use: "+violetta.sharePost());
        System.out.println("Kris use: "+kris.sharePost());

        //Then
        Assert.assertEquals("Twitter",mark.sharePost());
        Assert.assertEquals("Facebook",violetta.sharePost());
        Assert.assertEquals("Snapchat",kris.sharePost());
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User mark = new Millenials("Mark Snapchat");
        //When
        System.out.println("Mark use: " + mark.sharePost());
        mark.setSocialMedia(new SnapchatPublisher());
        System.out.println("Mark use: "+ mark.sharePost() +" now");
        //Then
        Assert.assertEquals("Snapchat",mark.sharePost());
    }
}
