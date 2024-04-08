package com.insta.Instagram_clone.Network.model;

import java.util.List;
import java.util.ArrayList;

public class network {
    String id;
    public List<String> follower_list = new ArrayList<>();
    public List<String> following_list = new ArrayList<>();
    public List<String> requests = new ArrayList<>();
    List<String> requested = new ArrayList<>();

    network(List<String> followerlist, List<String> followinglist, List<String> requests, List<String> requested) {
        this.follower_list = followerlist;
        this.following_list = followinglist;
        this.requests = requests;
        this.requested = requested;

    }

    public void Follow(String to_id) {
        requested.add(to_id);
        // Increase count of follow and following
    }

    public void Unfollow(String to_id) {
        following_list.remove(to_id);
        // decrease count of follow and following
    }

    public List<String> display_followers() {
        return follower_list;
    }

    public List<String> display_following() {
        return following_list;
    }

}
