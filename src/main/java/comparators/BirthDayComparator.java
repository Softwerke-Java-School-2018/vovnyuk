package main.java.comparators;

import main.java.entities.builders.Builder;

import java.util.Comparator;

public class BirthDayComparator implements Comparator<Builder>{

    public int compare(Builder a, Builder b){
        return a.getBirthDay().compareTo(b.getBirthDay());
    }
}
