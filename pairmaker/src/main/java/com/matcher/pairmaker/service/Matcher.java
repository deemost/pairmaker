package com.matcher.pairmaker.service;

import com.matcher.pairmaker.model.Person;
import com.matcher.pairmaker.model.Tuple;

import java.util.List;

public class Matcher{

    private List<Integer> weights;

    public Matcher(List<Integer> weights) {
        this.weights = weights;
    }

    private double findDistance(Person p1, Person p2){
        int bigVal = 0;
        for (int i = 0; i < p1.getAttributesValues().size(); i ++){
            bigVal += (weights.get(i)*(p1.getAttributesValues().get(i) - p2.getAttributesValues().get(i)) *
                    (p1.getAttributesValues().get(i) - p2.getAttributesValues().get(i)));
        }
        return Math.sqrt(bigVal);
    }

    private Tuple<Person, Person> findCompatibleWithFirst(List<Person> lp){
        Person comp = null;
        double min = Double.MAX_VALUE;
        for (int i = 1; i < lp.size(); i++){
            double dist = findDistance(lp.get(0), lp.get(i));
            if (dist <= min){
                min = dist;
                comp = lp.get(i);
            }
        }
        return new Tuple<>(lp.get(0), comp, min);
    }

    public void findCompatiblePairs(List<Person> lp, List<Tuple<Person,Person>> compatList){
        if (lp.size() == 0){
            return;
        }
        else {
            Tuple<Person, Person> pair = findCompatibleWithFirst(lp);
            compatList.add(pair);
            lp.remove(pair.getFirst());
            lp.remove(pair.getSecond());
            findCompatiblePairs(lp, compatList);
        }
    }
}
