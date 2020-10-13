package com.example.parse_server;


import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;


public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

// Enable Local Datastore.
        Parse.enableLocalDatastore(this);

// Add your initialization code here
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("362e0c00884242358d8f74c6f94876f7a0bb5242")
                .clientKey("91942246c46f9dbcda715af1491317a30089f6f0")
                .server("http://3.84.46.65:80/parse/")
                .build()
        );
//CKGB7eVCXxEk
//ParseUser.enableAutomaticUser();

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);

    }
}