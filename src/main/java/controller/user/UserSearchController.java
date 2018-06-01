package main.java.controller.user;

import main.java.entities.builders.Builder;
import main.java.model.user.ModelUser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class UserSearchController {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private UserSearchControllerOutput userSearchControllerOutput = new UserSearchControllerOutput();

    public void findUserById(int checkingId) {
        ArrayList<Builder> entity = ModelUser.getClients();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                if (checkingId == user.getId()) {
                    userSearchControllerOutput.userSearchControllerOutput(user);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no user with such Id(" + checkingId + ")");
            }
        }
    }

    public void findUserByFirstName(String checkingFirstName){
        Builder user = findUserByFirstNameModel(checkingFirstName);
        userSearchControllerOutput.userSearchControllerOutput(user);
    }

    public Builder findUserByFirstNameModel(String checkingFirstName) {
        ArrayList<Builder> entity = ModelUser.getClients();
        Builder currentClient = null;
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                if (checkingFirstName.equals(user.getFirstName())) {
//                    userSearchControllerOutput.userSearchControllerOutput(user);
                    currentClient = user;
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no user with such first name (" + checkingFirstName + ")");
            }
        } return currentClient;
    }

    public void findUserBySecondName(String checkingSecondName) {
        ArrayList<Builder> entity = ModelUser.getClients();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                if (checkingSecondName.equals(user.getSecondName())) {
                    userSearchControllerOutput.userSearchControllerOutput(user);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no user with such second name(" + checkingSecondName + ")");
            }
        }
    }

    public void findUserBirthDay(String checkingBirthDay) {
        try {
            ArrayList<Builder> entity = ModelUser.getClients();
            LocalDate localDate = LocalDate.parse(checkingBirthDay, formatter);
            int i = 0;
            if (entity.size() == 0) {
                System.out.println("This list is empty");
            } else {
                for (Builder user : entity) {
                    if (localDate.equals(user.getBirthDay())) {
                        userSearchControllerOutput.userSearchControllerOutput(user);
                    } else {
                        i = i + 1;
                    }
                }
                if (i == entity.size()) {
                    System.out.println("There is no user with such birthday(" + checkingBirthDay + ")");
                }
            }
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect birthday format");
        }
    }
}