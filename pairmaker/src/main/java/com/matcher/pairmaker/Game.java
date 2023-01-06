package com.matcher.pairmaker;

import com.matcher.pairmaker.model.Matcher;
import com.matcher.pairmaker.model.Person;
import com.matcher.pairmaker.model.Tuple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<String> loa = Arrays.asList("humor", "speed", "height");
        List<Integer> low = Arrays.asList(25, 25, 50);

        List<Integer> attributesValues1 = Arrays.asList(8, 2, 6);
        List<Integer> attributesValues2 = Arrays.asList(2, 3, 4);
        List<Integer> attributesValues3 = Arrays.asList(5, 3, 9);

        Person ricky = new Person("Ricky", loa, attributesValues1);
        Person jake = new Person("Jake", loa, attributesValues3);
        Person ryan = new Person("ryan", loa, attributesValues2);
        Person dave = new Person("dave", loa, attributesValues1);
        Person george = new Person("George", loa, attributesValues1);
        Person dan = new Person("Dan", loa, attributesValues2);

        ArrayList<Person> lp = new ArrayList<>();
        lp.add(jake);
        lp.add(ryan);
        lp.add(george);
        lp.add(dave);
        lp.add(dan);
        lp.add(ricky);

        Matcher matcher = new Matcher(low);

        List<Tuple<Person,Person>> compatList = new ArrayList<>();
        matcher.findCompatiblePairs(lp, compatList);
        System.out.println(compatList);
    }
}