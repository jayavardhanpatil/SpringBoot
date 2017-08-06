package io.spring.repository;

import io.spring.model.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jayavardhans on 6/8/17.
 */
public interface PlayerRepository extends CrudRepository<Player, Integer>{
}
