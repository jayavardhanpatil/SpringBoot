package io.spring.services;

import io.spring.controller.TeamController;
import io.spring.model.Team;
import io.spring.repository.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jayavardhans on 5/8/17.
 */
@Service
public class TeamServices {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

   @Autowired
    TeamRepository teamRepository;

    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }

    public Team getTeamForGivenId(int id){
        return teamRepository.findById(id);
    }

    public Team addTeam(Team team){
        try {
            teamRepository.insert(team);
        }catch (Exception e){
            return null;
        }
        return team;
    }

}
