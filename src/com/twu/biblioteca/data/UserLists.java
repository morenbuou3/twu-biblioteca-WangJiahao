package com.twu.biblioteca.data;

import com.twu.biblioteca.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserLists {
    private static List<User> userList = new ArrayList<User>();

    static {
        userList.add(new User("111-0000", "123", "wjh", "123@qq.com", "13311111111"));
        userList.add(new User("111-0001", "123", "wyx", "123@qq.com", "13311111112"));
    }

    public static List<User> getUserList() {
        return userList;
    }
}
