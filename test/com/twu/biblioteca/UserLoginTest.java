package com.twu.biblioteca;

import com.twu.biblioteca.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserLoginTest {
    private UserLogin userLogin = new UserLogin();
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void validCheckout() {
        Boolean expect = true;
        assertThat(expect, is(userLogin.checkUser("111-0000", "123")));
    }

    @Test
    public void wrongLibraryNum() {
        Boolean expect = false;
        assertThat(expect, is(userLogin.checkUser("222-0000", "123")));
    }

    @Test
    public void wrongPassword() {
        Boolean expect = false;
        assertThat(expect, is(userLogin.checkUser("111-0000", "1231")));
    }

    @Test
    public void loginSuccessful() {
        String expect = "Login Succeed!\r\n";
        userLogin.login("111-0000", "123");
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void loginUnsuccessful() {
        String expect = "Login Failed!\r\n";
        userLogin.login("111-0002", "123");
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void loginUserStoreInSession() {
        User user = new User("111-0000", "123", "", "", "");
        userLogin.login("111-0000", "123");
        assertThat(user, is(Session.getUser()));
    }

    @Test
    public void printUserInformationValid() {
        String expect = "Login Succeed!\r\n" +
                "User Information:\r\n" +
                "name|email|phone\r\n" +
                "========================\r\n" +
                "wjh|123@qq.com|13311111111\r\n" +
                "========================\r\n";
        User user = new User("111-0000", "123", "wjh", "123@qq.com", "13311111111");
        userLogin.login("111-0000", "123");
        userLogin.showUserInformation();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printUserInformationInvalid() {
        Session.setUser(null);
        String expect = "Please login!\r\n";
        userLogin.showUserInformation();
        assertThat(outContent.toString(), is(expect));
    }
}
