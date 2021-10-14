package com.volneineves.workshopmongo.services;

import com.volneineves.workshopmongo.domain.Post;
import com.volneineves.workshopmongo.repository.PostRepository;
import com.volneineves.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }
}
