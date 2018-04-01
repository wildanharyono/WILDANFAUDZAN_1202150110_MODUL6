package com.example.haryono.wildanharyono_1202150110_modul6_master;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Haryono on 3/31/2018.
 */
@IgnoreExtraProperties
public class Comment {
    public String uid;
    public String author;
    public String text;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }
}
