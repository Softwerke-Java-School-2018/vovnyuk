package comparators;

import entities.Builder;

import java.util.Comparator;

public class SecondNameComparator implements Comparator<Builder> {

    public int compare(Builder a, Builder b){
        return a.getSecondName().compareTo(b.getSecondName());
    }
}