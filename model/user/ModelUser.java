package model.user;

import model.DataTables;
import entities.This;
import view.MainMenu;

import java.time.LocalDate;

public class ModelUser {

    private DataTables dataTables = new DataTables();
    private MainMenu mainMenu = new MainMenu();

    public void addNext(String firstName, String secondName, LocalDate localDate) {

        dataTables.getUserList().add(This.builder()
                .firstName(firstName)
                .secondName(secondName)
                .birthDay(localDate)
                .build());

        System.out.println("User was successfully added");
        mainMenu.showMenu();

    }


}
