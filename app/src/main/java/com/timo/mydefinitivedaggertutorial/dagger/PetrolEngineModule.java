package com.timo.mydefinitivedaggertutorial.dagger;

import com.timo.mydefinitivedaggertutorial.car.Engine;
import com.timo.mydefinitivedaggertutorial.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
