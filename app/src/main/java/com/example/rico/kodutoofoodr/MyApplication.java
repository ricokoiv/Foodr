package com.example.rico.kodutoofoodr;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Rico on 16.03.2015.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "yjLu3YxENoWWZ56VK6zP9jSY7FQ9JdJ350nRxTZN", "4LfjwWf6i1bSfMJAcnj10Vla75xZscNMVXAXDzk7");
    }
}
