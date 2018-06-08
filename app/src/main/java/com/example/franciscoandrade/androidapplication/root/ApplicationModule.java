package com.example.franciscoandrade.androidapplication.root;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module //Signal Dagger it is a module that we can use
public class ApplicationModule {


    //Here we construct application object, so we can inject the context wherever we need
    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }


    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
