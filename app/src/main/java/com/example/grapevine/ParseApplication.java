package com.example.grapevine;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("B5OrZ6lgxOaVI466eZeIsuCh9vpOpYSqJ0ffd8ef")
                .clientKey("PZugnwRUrYrnALqPKWeUZgdB6PTJ3aC8W9AcGdpd")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}

