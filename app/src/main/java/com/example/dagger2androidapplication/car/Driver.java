package com.example.dagger2androidapplication.car;

public class Driver {
    // cannot use @Inject here as it is a third party class

    String name;

    public Driver(String name) {
        this.name = name;
    }
}
