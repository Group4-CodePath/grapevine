package com.example.grapevine;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9vmH03mv4S8jkyYFtfs3Q1XHjsFGIVM3SaZBAzdE")
                .clientKey("pWjpv1VCcKsjuNBgzAeYc92GZvxXmBmUJEfGnePI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
