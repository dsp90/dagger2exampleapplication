package com.example.dagger2androidapplication.car;

public class Wheels {

    // this is a third party class so it can't be annotated with @Inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
