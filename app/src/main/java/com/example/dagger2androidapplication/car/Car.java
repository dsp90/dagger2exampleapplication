package com.example.dagger2androidapplication.car;

import android.util.Log;

import com.example.dagger2androidapplication.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {

    /**
     * If we have constructor injection fields and methods are also injected automatically after
     * the constructor finishes in this following order.
     * Constructor -> Field -> Method
     */
    // Constructor -> Field -> Method
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, driver + " " + driver.name + " drives " + this);
    }
}
