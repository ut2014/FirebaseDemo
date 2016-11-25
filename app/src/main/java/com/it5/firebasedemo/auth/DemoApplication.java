package com.it5.firebasedemo.auth;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by IT5 on 2016/11/24.
 */

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
