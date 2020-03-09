package com.conelius.self.util;

import android.app.Application;

/**
 * created by Conelius on 3/5/2020 at 6:02 PM : ceekayconelius@gmail.com , github @conykay.
 */
public class JournalApi extends Application {
    private String username;
    private String userId;
    private static JournalApi instance;

    public static JournalApi getInstance() {
        if (instance == null)
            instance = new JournalApi();
        return instance;
    }

    public JournalApi() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
