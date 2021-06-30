package com.example.dagger2androidapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2androidapplication.car.Car;
import com.example.dagger2androidapplication.dagger.ActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory().create(150, 1400);

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}