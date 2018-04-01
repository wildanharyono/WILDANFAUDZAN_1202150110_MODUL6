package com.example.haryono.wildanharyono_1202150110_modul6_master;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by haryono on 4/1/2018.
 */

public class RecentPostsFragment extends PostListFragment {
    public RecentPostsFragment(){}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]

        // Last 100 posts, these are automatically the 100 most recent

        // due to sorting by push() keys

        Query recentPostsQuery = databaseReference.child("posts")
                .limitToFirst(100);
        // [END recent_posts_query]
        return recentPostsQuery;
    }
}