package com.example.haryono.wildanharyono_1202150110_modul6_master;

/**
 * Created by haryono on 4/1/2018.
 */

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by haryono on 3/31/2018.
 */

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}
    @Override

    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("user-posts")
                .child(getUid());

    }
}