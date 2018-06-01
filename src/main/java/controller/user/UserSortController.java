package main.java.controller.user;

import main.java.comparators.BirthDayComparator;
import main.java.comparators.FirstNameComparator;
import main.java.comparators.SecondNameComparator;
import main.java.entities.builders.Builder;
import main.java.model.user.ModelUser;

import java.util.ArrayList;
import java.util.Collections;

public class UserSortController {

    public void sortByFirstName() {
        ArrayList<Builder> entity = ModelUser.getClients();
        Collections.sort(entity, new FirstNameComparator());
        System.out.println("\nSorted by first name");
        for (Builder user : entity)
            System.out.println(user);
    }

    public void sortBySecondName() {
        ArrayList<Builder> entity = ModelUser.getClients();
        Collections.sort(entity, new SecondNameComparator());
        if (entity.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("\nSorted by second name");
            for (Builder user : entity)
                System.out.println(user);
        }
    }

    public void sortByBirthday() {
        ArrayList<Builder> entity = ModelUser.getClients();
        Collections.sort(entity, new BirthDayComparator());
        System.out.println("\nSorted by birthday");
        for (Builder user : entity)
            System.out.println(user);
    }


}
