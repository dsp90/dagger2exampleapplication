package com.example.dagger2androidapplication.dagger;

import com.example.dagger2androidapplication.car.DieselEngine;
import com.example.dagger2androidapplication.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}
