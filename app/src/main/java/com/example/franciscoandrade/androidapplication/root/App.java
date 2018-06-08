package com.example.franciscoandrade.androidapplication.root;


import android.app.Application;


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
                .build();

    }
}
