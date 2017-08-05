package io.spring.controller;

import io.spring.model.Team;
import io.spring.services.TeamServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jayavardhans on 5/8/17.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/teams", produces= MediaType.APPLICATION_JSON_VALUE)
public class TeamController {

    @Autowired
    TeamServices teamServices;

    @RequestMapping("")
    @ApiOperation(value = "getAll Tems", notes = "")
    public List<Team> getAllTeams(){
        return teamServices.getAllTeams();

    }

    @RequestMapping("/{id}")
    @ApiOperation(value = "get Team detail for given Id", notes = "")
    public Team getTeamForGivenId(@PathVariable int id){
        return teamServices.getTeamForGivenId(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ApiOperation(value = "Add new Team", notes = "")
    public ResponseEntity creatTeam(@RequestBody Team team){
        teamServices.addTeam(team);
        return new ResponseEntity("Team "+team.getTeamName()+" Successfully Added", HttpStatus.CREATED);
    }
}
