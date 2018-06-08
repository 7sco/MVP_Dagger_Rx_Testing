package com.example.franciscoandrade.androidapplication.root;


import com.example.franciscoandrade.androidapplication.login.LoginActivity;
import com.example.franciscoandrade.androidapplication.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

//Signal dagger it is a component for the application module
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    //Define where the injection will take place
    //In this case we have login activity where we are going to inject the presenter
    void inject(LoginActivity targe);
}
