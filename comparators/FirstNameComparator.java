package comparators;

import entities.Builder;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Builder> {

    public int compare(Builder a, Builder b){
        return a.getFirstName().compareTo(b.getFirstName());
    }
}
