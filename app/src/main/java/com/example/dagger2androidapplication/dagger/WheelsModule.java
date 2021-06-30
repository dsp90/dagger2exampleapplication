package com.example.dagger2androidapplication.dagger;

import com.example.dagger2androidapplication.car.Rims;
import com.example.dagger2androidapplication.car.Tires;
import com.example.dagger2androidapplication.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
