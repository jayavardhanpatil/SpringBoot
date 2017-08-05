package io.spring.model;

import java.security.Timestamp;
import java.text.SimpleDateFormat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

/**
 * Created by jayavardhans on 5/8/17.
 */
@Data
public class Team {
    @Id
    private int id;
    private String teamName;
    private String date;

    public Team(){
    }
    public Team(int id, String teamName, String date){
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
