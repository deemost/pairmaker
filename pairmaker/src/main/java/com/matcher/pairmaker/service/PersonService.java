package com.matcher.pairmaker.service;

import com.matcher.pairmaker.model.Person;

import java.util.List;

public interface PersonService {

    public Person createPerson(String name, List<String> loa, List<Integer> attributesValues, String room);
}
