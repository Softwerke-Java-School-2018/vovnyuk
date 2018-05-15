import entities.dbOfClientsDevicesAndPurchases.AddDbOfPurchases;
import view.MainMenu;

import entities.dbOfClientsDevicesAndPurchases.AddDbOfClients;
import entities.dbOfClientsDevicesAndPurchases.AddDbOfDevices;


/**
 * Entry point for the whole program
 *@author Vovnyuk Maxim
 */
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
