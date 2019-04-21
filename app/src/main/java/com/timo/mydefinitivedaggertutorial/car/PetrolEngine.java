package com.timo.mydefinitivedaggertutorial.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("power") int horsePower,
                        @Named("capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "petrol engine started." +
                "\nhp: " + horsePower +
                "\ncapacity: " + engineCapacity);
    }
}
