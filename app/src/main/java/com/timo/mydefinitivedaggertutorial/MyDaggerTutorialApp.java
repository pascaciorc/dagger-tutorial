package com.timo.mydefinitivedaggertutorial;

import android.app.Application;

import com.timo.mydefinitivedaggertutorial.dagger.AppComponent;
import com.timo.mydefinitivedaggertutorial.dagger.DaggerAppComponent;

public class MyDaggerTutorialApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
