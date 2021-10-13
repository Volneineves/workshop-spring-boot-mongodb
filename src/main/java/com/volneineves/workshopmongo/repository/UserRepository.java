package com.volneineves.workshopmongo.repository;

import com.volneineves.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// A interface extender o MongoRepository que por sua vez irá pedir a entidade de domínio e o tipo de ID
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
