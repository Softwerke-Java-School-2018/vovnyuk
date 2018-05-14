package entities.dbOfClientsAndDevices;

import controller.user.UserController;

public class AddDbOfClients {

    private UserController userController = new UserController();

    public void addClients(){

        userController.create("Nikita", "Sherepa", "01/02/1994");
        userController.create("Artem", "Kharakhnin", "11/02/1994");
        userController.create("Nikolai", "Pul'kin", "01/10/1967");
        userController.create("Evgeniy", "Vahtin", "03/04/1999");
        userController.create("Andrei", "Pushkin", "15/05/1799");
        userController.create("Alexey", "Kolotushkin", "31/12/1899");
    }
}
