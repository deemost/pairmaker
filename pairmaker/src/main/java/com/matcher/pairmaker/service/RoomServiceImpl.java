package com.matcher.pairmaker.service;

import com.matcher.pairmaker.model.Person;
import com.matcher.pairmaker.model.Room;
import com.matcher.pairmaker.model.Tuple;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomServiceImpl implements RoomService{

    private Matcher matcher = new Matcher(Arrays.asList(25, 25, 50));

    private Map<String, Room> rooms = new HashMap<>();
    @Override
    public Room createRoom() {
        String code = RandomStringUtils.random(4);
        Room room = new Room(code, new ArrayList<Person>());
        rooms.put(code, room);
        return room;
    }

    @Override
    public void addToRoom(String code, Person person) {
        rooms.get(code).getPlayers().add(person);
    }
    @Override
    public List<Tuple<Person, Person>> getMatches(String code) {
        List<Tuple<Person,Person>> compatList = new ArrayList<>();
        matcher.findCompatiblePairs(rooms.get(code).getPlayers(), compatList);
        return compatList;
    }


}
