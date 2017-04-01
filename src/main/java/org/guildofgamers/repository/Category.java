package org.guildofgamers.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by smday on 01/04/2017.
 */

@Data
public class Category {

    @Id
    private String id;

    @DBRef
    private Collection<User> users;

}
