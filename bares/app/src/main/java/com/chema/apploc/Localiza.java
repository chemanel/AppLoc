package com.chema.apploc;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by chema on 26/02/15.
 */
public class Localiza extends Application {


    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "RlBohFQOxpyUxYPoXdoPgkc5QtkWwl1uShv6ayF4","lCQBVJ6ZWU3NUJCpU4NPLABFYSRYnic2D8N6Ot28");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}
