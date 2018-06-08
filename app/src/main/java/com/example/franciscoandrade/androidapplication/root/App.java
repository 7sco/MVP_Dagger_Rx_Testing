package com.example.franciscoandrade.androidapplication.root;


import android.app.Application;

import com.example.franciscoandrade.androidapplication.login.LoginModel;
import com.example.franciscoandrade.androidapplication.login.LoginModule;


//create application component by extending application
public class App extends Application{
    private ApplicationComponent component;

    public ApplicationComponent getComponent() {
        return component;
    }


    //Define what the component is
    @Override
    public void onCreate() {
        super.onCreate();

        component= DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();

    }
}
