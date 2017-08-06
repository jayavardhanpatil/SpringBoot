package io.spring.model;

//import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * Created by jayavardhans on 5/8/17.
 */
@Entity
public class Player {
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String teamName;
    private String date;

    public Player(){
    }
    public Player(int id, String teamName, String date){
        this.id = id;
        this.teamName = teamName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
