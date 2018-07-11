package com.twu.biblioteca;

import com.twu.biblioteca.data.UserLists;
import com.twu.biblioteca.entity.User;

import java.util.List;

public class UserLogin {
    public void login(String libraryNum, String password) {
        if (checkUser(libraryNum, password)) {
            UserLists.getUserList().stream().forEach(n -> {
                if (n.getLibraryNumber().equals(libraryNum)) {
                    Session.setUser(n);
                }
            });
            showLoginSuccessful();
        } else {
            showLoginUnsuccessful();
        }
    }

    public Boolean checkUser(String libraryNum, String password) {
        List<User> users = UserLists.getUserList();
        return users.stream().anyMatch(user -> user.getLibraryNumber().equals(libraryNum)
                && user.getPassword().equals(password));
    }

    private void showLoginSuccessful() {
        System.out.println("Login Succeed!");
    }

    private void showLoginUnsuccessful() {
        System.out.println("Login Failed!");
    }
}
