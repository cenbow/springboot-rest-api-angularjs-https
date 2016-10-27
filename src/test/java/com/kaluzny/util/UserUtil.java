package com.kaluzny.util;

import com.kaluzny.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserUtil {

    private static final long ID = 100;
    private static final String TITLE = "title";
    private static final long VALUE = 100;

    private UserUtil() {
    }

    public static User createUser() {
        return new User(ID, TITLE,VALUE);
    }

    public static List<User> createUserList(int howMany) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            userList.add(new User(ID + i, TITLE, VALUE));
        }
        return userList;
    }
}