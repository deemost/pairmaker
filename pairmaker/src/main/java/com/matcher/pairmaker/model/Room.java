package com.matcher.pairmaker.model;

import java.util.List;

public class Room {
    private String code;
    private List<Person> players;

    public Room(String code, List<Person> players) {
        this.code = code;
        this.players = players;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Person> getPlayers() {
        return players;
    }

    public void setPlayers(List<Person> players) {
        this.players = players;
    }
}
