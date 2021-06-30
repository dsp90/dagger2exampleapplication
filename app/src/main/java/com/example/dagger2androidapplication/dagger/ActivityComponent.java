package com.example.dagger2androidapplication.dagger;

import com.example.dagger2androidapplication.MainActivity;
import com.example.dagger2androidapplication.car.Car;
import com.example.dagger2androidapplication.car.PetrolEngine;

import javax.inject.Named;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Factory
    interface Factory{

        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity );
    }

}
