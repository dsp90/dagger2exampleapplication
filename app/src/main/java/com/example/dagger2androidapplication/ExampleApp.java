package com.example.dagger2androidapplication;

import android.app.Application;

import com.example.dagger2androidapplication.dagger.AppComponent;
import com.example.dagger2androidapplication.dagger.DaggerAppComponent;
import com.example.dagger2androidapplication.dagger.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }

    public AppComponent getAppComponent(){
        return component;
    }
}
