package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int peselUser;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int peselUser, final String userName, final char sex,
                     final LocalDate birthDate, final int numberOfPosts) {
        this.peselUser = peselUser;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getPeselUser() {
        return peselUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "peselUser=" + peselUser +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
