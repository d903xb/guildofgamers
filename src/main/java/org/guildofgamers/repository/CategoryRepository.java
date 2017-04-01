package org.guildofgamers.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by smday on 01/04/2017.
 */
public interface CategoryRepository extends MongoRepository<Category, String> {
}
