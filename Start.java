import entities.dbOfClientsAndDevices.AddDbOfPurchases;
import view.MainMenu;

import entities.dbOfClientsAndDevices.AddDbOfClients;
import entities.dbOfClientsAndDevices.AddDbOfDevices;

public class Start {

    private static MainMenu mainMenu = new MainMenu();
    private static AddDbOfClients addDbOfClients = new AddDbOfClients();
    private static AddDbOfDevices addDbOfDevices = new AddDbOfDevices();
    private static AddDbOfPurchases addDbOfPurchases = new AddDbOfPurchases();


    public static void main(String args[]) {

        addDbOfClients.addClients();
        addDbOfDevices.addDevices();
        addDbOfPurchases.addPurchases();
        mainMenu.showMenu();

    }

}
