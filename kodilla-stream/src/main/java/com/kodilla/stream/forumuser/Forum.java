package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(950201000, "Kevin", 'M',
                LocalDate.of(1995,2,1), 5));
        theForumUsersList.add(new ForumUser(950202001, "John", 'M',
                LocalDate.of(1995,2,2), 1));
        theForumUsersList.add(new ForumUser(980201002, "Ken", 'M',
                LocalDate.of(1998,2,1), 5));
        theForumUsersList.add(new ForumUser(950203003, "Nel", 'F',
                LocalDate.of(1995,2,3), 5));
        theForumUsersList.add(new ForumUser(950204004, "Mary", 'F',
                LocalDate.of(1995,2,4), 5));
        theForumUsersList.add(new ForumUser(950205005, "Kora", 'F',
                LocalDate.of(1995,2,5), 5));
        theForumUsersList.add(new ForumUser(950206006, "Sam", 'M',
                LocalDate.of(1995,2,6), 0));
        theForumUsersList.add(new ForumUser(950207007, "Sandra", 'F',
                LocalDate.of(1995,2,7), 5));
        theForumUsersList.add(new ForumUser(950208008, "Samuel", 'M',
                LocalDate.of(1995,2,8), 5));
        theForumUsersList.add(new ForumUser(950209009, "Tori", 'F',
                LocalDate.of(1995,2,9), 5));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUsersList);
    }
}
