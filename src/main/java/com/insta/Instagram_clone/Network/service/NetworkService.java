package com.insta.Instagram_clone.Network.service;

import java.util.List;
import com.insta.Instagram_clone.Network.model.*;
import com.insta.Instagram_clone.Network.repository.*;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class NetworkService {

    private final NetworkRepository repository;

    @Autowired
    public NetworkService(NetworkRepository repository) {
        this.repository = repository;
    }

    public List<Follower> getAllDocumentsByUserId(String user_id) {
        return repository.findByUserId(user_id);
    }
}
