package com.example.franciscoandrade.androidapplication.login;

public interface LoginRepository {

    User getUser();
    void saveUser(User user);

}
