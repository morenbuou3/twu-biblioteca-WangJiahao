package com.twu.biblioteca;

import com.twu.biblioteca.data.UserLists;
import com.twu.biblioteca.entity.User;

import java.util.List;

public class UserLogin {
    private LibraryView libraryView = new LibraryView();

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

    public void showUserInformation() {

    }

    private void showLoginSuccessful() {
        System.out.println("Login Succeed!");
    }

    private void showLoginUnsuccessful() {
        System.out.println("Login Failed!");
    }

    public boolean checkLogin() {
        if (Session.getUser() == null) {
            libraryView.showLoginTip();
            return false;
        }
        return true;
    }
}
