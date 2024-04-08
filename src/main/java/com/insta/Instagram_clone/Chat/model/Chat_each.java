package com.insta.Instagram_clone.Chat.model;

// public class Chat {
//     public static void main(String[] args) {
//         // Example usage
//         Chat_each chat1 = ChatFactory.createChat(1, 2, "Hello");
//         Chat_each chat2 = ChatFactory.createChat(3, 4, new Video("video.mp4"));
//         Chat_each chat3 = ChatFactory.createChat(5, 6, new Audio("audio.mp3"));
//     }
// }

// on click on the user make a new chat (creator class for chat object)
// package com.example.demo.model;

// import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document("chats")
public class Chat_each {
    @Id
    private String id;
    String to_id;
    String from_id;
    Content content;

    public Chat_each(String to_id, String from_id, Content content) {
        this.to_id = to_id;
        this.from_id = from_id;
        this.content = content;
    }

    public String get_to_id() {
        return to_id;
    }

    public String get_from_id() {
        return from_id;
    }

    public Content get_content() {
        return content;
    }
}

// Define a Content Stringerface