package com.example.haryono.wildanharyono_1202150110_modul6_master;

/**
 * Created by haryono on 4/1/2018.
 */

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Haryono on 3/30/2018.
 */

@IgnoreExtraProperties
public class User {
    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
