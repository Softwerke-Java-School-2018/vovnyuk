import view.MainMenu;

import model.user.ModelUser;
import entities.Builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Start {

    private static MainMenu mainMenu = new MainMenu();

    private static ModelUser modelUser = new ModelUser();

    public static void main(String args[]) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse("15/03/1938", formatter);
        LocalDate localDate2 = LocalDate.parse("23/09/1965", formatter);
        LocalDate localDate3 = LocalDate.parse("17/12/1987", formatter);
        LocalDate localDate4 = LocalDate.parse("01/01/2001", formatter);
        LocalDate localDate5 = LocalDate.parse("06/06/1799", formatter);

        Builder newUser1 = new Builder("Danilov", "Petr", localDate1);
        Builder newUser2 = new Builder("Kharaknin", "Nikita", localDate2);
        Builder newUser3 = new Builder("Ambrasovskiy", "Yuriy", localDate3);
        Builder newUser4 = new Builder("Bezov", "Gavrila", localDate4);
        Builder newUser5 = new Builder("Pushkin", "Alexandr", localDate5);

        modelUser.addNext(newUser1);
        modelUser.addNext(newUser2);
        modelUser.addNext(newUser3);
        modelUser.addNext(newUser4);
        modelUser.addNext(newUser5);
        mainMenu.showMenu();
    }

}
