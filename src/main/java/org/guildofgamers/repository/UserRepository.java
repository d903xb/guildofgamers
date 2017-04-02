package org.guildofgamers.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Collection;

/**
 * Created by smday on 01/04/2017.
 */
public interface UserRepository extends JpaRepository<User, String> {

    Collection<User> findByUsername(String username);

    Collection<User> findByUsernameBetween(String from, String to);


}
