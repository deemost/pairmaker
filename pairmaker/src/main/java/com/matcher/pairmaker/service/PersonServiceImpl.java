package com.matcher.pairmaker.service;

import com.matcher.pairmaker.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService{

    private final RoomService roomService;

    public PersonServiceImpl(RoomService roomService) {
        this.roomService = roomService;
    }

    @Override
    public Person createPerson(String name, List<String> loa, List<Integer> attributesValues, String code) {
        Person person = new Person(name, loa, attributesValues);
        roomService.addToRoom(code, person);
        return person;
    }
}
