package com.timo.mydefinitivedaggertutorial.dagger;

import com.timo.mydefinitivedaggertutorial.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
