package com.itheima;

public interface UserService {

    void login(String username, String password) throws Exception;

    void deleteUser() throws Exception;

    String[] selectUser() throws Exception;
}
