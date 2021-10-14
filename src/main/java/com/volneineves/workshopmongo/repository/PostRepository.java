package com.volneineves.workshopmongo.repository;

import com.volneineves.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// A interface extender o MongoRepository que por sua vez irá pedir a entidade de domínio e o tipo de ID
@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
