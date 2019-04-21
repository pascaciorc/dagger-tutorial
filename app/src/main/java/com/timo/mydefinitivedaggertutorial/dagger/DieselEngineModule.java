package com.timo.mydefinitivedaggertutorial.dagger;

import com.timo.mydefinitivedaggertutorial.car.DieselEngine;
import com.timo.mydefinitivedaggertutorial.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine providesEngine(DieselEngine engine) {
        return engine;
    }
}
