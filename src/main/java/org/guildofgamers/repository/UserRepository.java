package org.guildofgamers.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

/**
 * Created by smday on 01/04/2017.
 */
public interface UserRepository extends MongoRepository<User, String> {

    Collection<User> findByUsername(String username);

    Collection<User> findByUsernameBetween(String from, String to);


}
