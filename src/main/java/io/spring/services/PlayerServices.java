package io.spring.services;

import io.spring.model.Player;
import io.spring.model.Team;
import io.spring.repository.PlayerRepository;
import io.spring.repository.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jayavardhans on 5/8/17.
 */
@Service
public class PlayerServices {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

   @Autowired
   PlayerRepository playerRepository;

    public List<Player> getAllTeams(){
        //return playerRepository.findAl;
        return null;
    }

    public Player getTeamForGivenId(int id){
        return playerRepository.findOne(id);
    }

    public Player addTeam(Player player){
        try {
            playerRepository.save(player);
        }catch (Exception e){
            e.printStackTrace();
        }
        return player;
    }

}
