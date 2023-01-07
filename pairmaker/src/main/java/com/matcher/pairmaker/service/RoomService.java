package com.matcher.pairmaker.service;

import com.matcher.pairmaker.model.Person;
import com.matcher.pairmaker.model.Room;
import com.matcher.pairmaker.model.Tuple;

import java.util.List;

public interface RoomService {

    public Room createRoom();

    public void addToRoom(String code, Person person);
    public List<Tuple<Person,Person>> getMatches(String code);



}
