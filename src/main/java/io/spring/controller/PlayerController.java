package io.spring.controller;

import io.spring.model.Player;
import io.spring.model.Team;
import io.spring.services.PlayerServices;
import io.spring.services.TeamServices;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping(value = "/player", produces= MediaType.APPLICATION_JSON_VALUE)
public class PlayerController {

    @Autowired
    PlayerServices playerServices;

    @RequestMapping("")
    @ApiOperation(value = "getAll Tems", notes = "")
    public List<Player> getAllTeams(){
        return playerServices.getAllTeams();

    }

    @RequestMapping("/healthCheck")
    @ApiOperation(value = "getAll Tems", notes = "")
    public String getStatus(){
        return "Working Fine";

    }

    @RequestMapping("/{id}")
    @ApiOperation(value = "get Team detail for given Id", notes = "")
    public Player getTeamForGivenId(@PathVariable int id){
        return playerServices.getTeamForGivenId(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ApiOperation(value = "Add new Team", notes = "")
    public ResponseEntity creatTeam(@RequestBody Player player){
        playerServices.addTeam(player);
        return new ResponseEntity("Team "+player.getTeamName()+" Successfully Added", HttpStatus.CREATED);
    }
}
