package com.matcher.pairmaker.service;

import com.matcher.pairmaker.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonServiceImpl implements PersonService{

    private Map<String, List<Person>> cache = new HashMap<>();

    @Override
    public Person createPerson(String name, List<String> loa, List<Integer> attributesValues, String room) {
        Person person = new Person(name, loa, attributesValues);
        if (!cache.containsKey(room)){
            cache.put(room, new ArrayList<>());
        }
        cache.get(room).add(person);

        return person;
    }
}
