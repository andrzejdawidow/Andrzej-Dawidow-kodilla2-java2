package com.kodilla.stream;

import java.util.Map;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.Forum;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> resultMapOfForumUser = theForum.getList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getBirthDate().getYear() <= 1997)
                .filter(s -> s.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getPeselUser, s -> s));

        resultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
