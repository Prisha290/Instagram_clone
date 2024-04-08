package com.insta.Instagram_clone.Network.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.insta.Instagram_clone.Chat.repository.*;
import com.insta.Instagram_clone.Network.model.*;
import com.insta.Instagram_clone.Network.repository.*;
import com.insta.Instagram_clone.Network.service.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
@RequestMapping("/network")

public class networkcontroller {

    private final NetworkService service;

    @Autowired
    public networkcontroller(NetworkService service) {
        this.service = service;
    }

    @GetMapping("/followers")
    public List<Follower> handleMessage(String user_id) {
        // Extract content and type from the request
        // network n1 =new network([],)
        return service.getAllDocumentsByUserId(user_id);

    }
    // @GetMapping("/followers")
    // public List<Follower> getFollowers(@RequestParam String user_id) {
    // return service.getAllDocumentsByUserId(Integer.parseInt(user_id));
    // }

}