package main.java.controller.user;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import main.java.model.user.ModelUser;
import main.java.entities.builders.Builder;
import main.java.view.MainMenu;

public class UserController {

    private ModelUser modelUser = new ModelUser();

    private static ArrayList<Builder> clientsList = ModelUser.getClients();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private MainMenu mainMenu = new MainMenu();

    public void create(String firstName, String secondName, String birthDay) {
        try {
            LocalDate localDate = LocalDate.parse(birthDay, formatter);
            Builder newUser = new Builder(firstName, secondName, localDate);
            clientsList.add(newUser);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect birthday format");
            mainMenu.showMenu();

        }
    }

    public void delete(int idToDelete) {
        modelUser.deleteUser(idToDelete);
    }

    public void showList() {
        ArrayList<Builder> entity = ModelUser.getClients();
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
}