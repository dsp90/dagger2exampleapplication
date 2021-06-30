package com.example.dagger2androidapplication.dagger;

import com.example.dagger2androidapplication.car.Engine;
import com.example.dagger2androidapplication.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
