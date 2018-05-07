package controller.user;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;

import comparators.BirthDayComparator;
import comparators.FirstNameComparator;
import comparators.SecondNameComparator;
import model.user.ModelUser;
import entities.Builder;

public class UserController {

    private ModelUser modelUser = new ModelUser();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int i = 0;

    public void create(String firstName, String secondName, String birthDay) {
        try {
            LocalDate localDate = LocalDate.parse(birthDay, formatter);
            Builder newUser = new Builder(firstName, secondName, localDate);
            modelUser.addNext(newUser);
            System.out.println("User has been successfully added");
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect birthday format");
        }
    }
    public void delete(int idToDelete) {
        ArrayList<Builder> entity = modelUser.getClients();
        modelUser.deleteUser(idToDelete);
        System.out.println("User has been successfully removed");
    }
    public void sortByFirstName(){
        ArrayList<Builder> entity = modelUser.getClients();
        Collections.sort(entity, new FirstNameComparator());
        System.out.println("\nSorted by first name");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void sortBySecondName(){
        ArrayList<Builder> entity = modelUser.getClients();
        Collections.sort(entity, new SecondNameComparator());
        System.out.println("\nSorted by second name");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void sortByBirthday(){
        ArrayList<Builder> entity = modelUser.getClients();
        Collections.sort(entity, new BirthDayComparator());
        System.out.println("\nSorted by birthday");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void showList() {
        ArrayList<Builder> entity = modelUser.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                System.out.println("Id:" + user.getId());
                System.out.println("First name:" + user.getFirstName());
                System.out.println("Second name:" + user.getSecondName());
                System.out.println("Birthday:" + user.getBirthDay());

            }
        }
    }
    public void findUserById(int checkingId) {
        ArrayList<Builder> entity = modelUser.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                if (checkingId == user.getId()) {
                    System.out.println("Id:" + checkingId);
                    System.out.println("First name:" + user.getFirstName());
                    System.out.println("Second name:" + user.getSecondName());
                    System.out.println("Birthday:" + user.getBirthDay());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no user with such Id(" + checkingId + ")");
            }
        }
    }
    public void findUserByFirstName(String checkingFirstName) {
        ArrayList<Builder> entity = modelUser.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                if (checkingFirstName.equals(user.getFirstName())) {
                    System.out.println("Id:" + user.getId());
                    System.out.println("First name:" + user.getFirstName());
                    System.out.println("Second name:" + user.getSecondName());
                    System.out.println("Birthday:" + user.getBirthDay());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no user with such first name (" + checkingFirstName + ")");
            }
        }
    }
    public void findUserBySecondName(String checkingSecondName) {
        ArrayList<Builder> entity = modelUser.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                if (checkingSecondName.equals(user.getSecondName())) {
                    System.out.println("Id:" + user.getId());
                    System.out.println("First name:" + user.getFirstName());
                    System.out.println("Second name:" + user.getSecondName());
                    System.out.println("Birthday:" + user.getBirthDay());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no user with such second name(" + checkingSecondName + ")");
            }
        }
    }
    public void findUserBirthDay(String checkingBirthDay) {
        try {
            ArrayList<Builder> entity = modelUser.getClients();
            LocalDate localDate = LocalDate.parse(checkingBirthDay, formatter);
            if (entity.size() == 0) {
                System.out.println("This list is empty");
            } else {
                for (Builder user : entity) {
                    if (localDate.equals(user.getBirthDay())) {
                        System.out.println("Id:" + user.getId());
                        System.out.println("First name:" + user.getFirstName());
                        System.out.println("Second name:" + user.getSecondName());
                        System.out.println("Birthday:" + user.getBirthDay());
                    } else {
                        i = i + 1;
                    }
                }
                if (i > 0) {
                    System.out.println("There is no user with such birthday(" + checkingBirthDay + ")");
                }
            }
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect birthday format");
        }
    }
}
