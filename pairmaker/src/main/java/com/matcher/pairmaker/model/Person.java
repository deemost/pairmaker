package com.matcher.pairmaker.model;



import java.util.List;

public class Person {

    private String name;
    private List<String> loa;
    private List<Integer> attributesValues;

    public Person(String name, List<String> loa, List<Integer> attributesValues) {
        this.name = name;
        this.loa = loa;
        this.attributesValues = attributesValues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLoa() {
        return loa;
    }

    public void setLoa(List<String> loa) {
        this.loa = loa;
    }

    public List<Integer> getAttributesValues() {
        return attributesValues;
    }

    public void setAttributesValues(List<Integer> attributesValues) {
        this.attributesValues = attributesValues;
    }

    @Override
    public String toString() {
        StringBuilder aData = new StringBuilder();
        for (int i = 0; i < loa.size(); i++){
            aData.append(loa.get(i)).append("= ").append(attributesValues.get(i)).append(" ");
        }
        return "name= '" + name  + "', " + aData;
    }
}
