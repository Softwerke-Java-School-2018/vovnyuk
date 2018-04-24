package controller.user;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import model.user.ModelUser;
import view.MainMenu;


public class UserController {

    public UserController() {

    }

    private ModelUser modelUser = new ModelUser();
    private MainMenu mainMenu = new MainMenu();

    public void create(String firstName, String secondName, String birthDay) {

        if (firstName.matches("^[a-zA]+$")) {
            if (secondName.matches("^[a-zA]+$")){
                try {
                    DateTimeFormatter ik = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate localDate = LocalDate.parse(birthDay, ik);

                    modelUser.addNext(firstName, secondName, localDate);


                } catch (DateTimeParseException e) {
                    System.out.println("Unacceptable date format.");

                }
            }
        }
        mainMenu.showMenu();




    }


}
