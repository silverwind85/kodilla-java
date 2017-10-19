package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(0,"Johny Smith",'M',1976,12,12,34));
        forumUserList.add(new ForumUser(1,"Ewelina Krawiec",'F',1996,2,3,134));
        forumUserList.add(new ForumUser(2,"Michał Jajko",'M',1995,6,22,67));
        forumUserList.add(new ForumUser(3,"Izabela Mucha",'F',1997,10,18,7));
        forumUserList.add(new ForumUser(4,"Marcin Pies",'M',1999,8,19,1));
        forumUserList.add(new ForumUser(5,"Monika Giza",'F',1989,2,8,789));
        forumUserList.add(new ForumUser(6,"Beata Pająk",'F',1983,12,29,70));
        forumUserList.add(new ForumUser(7,"Bartosz Kuc",'M',2000,11,4,19));
        forumUserList.add(new ForumUser(8,"Sławomir Cieślar",'M',1987,8,9,34));
        forumUserList.add(new ForumUser(9,"Stanisław Abot",'M',1954,4,30,341));
        forumUserList.add(new ForumUser(10,"Andrzej Sikora",'M',1997,10,18,354));
        forumUserList.add(new ForumUser(11,"Emila Pilch",'F',1956,3,12,2334));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
