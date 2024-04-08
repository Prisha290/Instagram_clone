// package com.insta.Instagram_clone.Network.model;

// import java.util.List;

// public class Follower {
//     public String user_id;
//     public List<String> followers;

//     Follower(String user_id, List<String> followers) {
//         this.user_id = user_id;
//         this.followers = followers;
//     }

// }

package com.insta.Instagram_clone.Network.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("followers")
public class Follower {
    public String userId; // Change field name to userId
    public List<String> followers;

    public Follower(String userId, List<String> followers) {
        this.userId = userId;
        this.followers = followers;
    }
}
