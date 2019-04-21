package com.timo.mydefinitivedaggertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.timo.mydefinitivedaggertutorial.car.Car;
import com.timo.mydefinitivedaggertutorial.dagger.ActivityComponent;
import com.timo.mydefinitivedaggertutorial.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = DaggerActivityComponent
                .builder()
                .horsePower(120)
                .engineCapacity(1300)
                .appComponent(((MyDaggerTutorialApp) getApplication()).getAppComponent())
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
