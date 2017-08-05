package io.spring.repository;

import io.spring.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jayavardhans on 5/8/17.
 */

public interface TeamRepository extends MongoRepository<Team, String> {

    public Team findById(int Id);

}

