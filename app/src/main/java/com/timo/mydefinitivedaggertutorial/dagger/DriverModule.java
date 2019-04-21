package com.timo.mydefinitivedaggertutorial.dagger;

import com.timo.mydefinitivedaggertutorial.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}
