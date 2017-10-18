package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainForum {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser
                        .getGender() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() >= 20)
                .filter(forumUser -> forumUser.getPost() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));
        System.out.println("# elements: " + resultMapOfForumUser.size());
        resultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
