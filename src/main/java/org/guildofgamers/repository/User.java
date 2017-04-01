package org.guildofgamers.repository;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.persistence.*;

/**
 * Created by smday on 01/04/2017.
 */
@Data
public class User {

    @Id
    private String id;

    private String username;

}
