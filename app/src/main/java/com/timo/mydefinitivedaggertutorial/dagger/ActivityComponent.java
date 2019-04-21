package com.timo.mydefinitivedaggertutorial.dagger;

import com.timo.mydefinitivedaggertutorial.MainActivity;
import com.timo.mydefinitivedaggertutorial.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class,
        modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}
