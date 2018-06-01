package controller.user;

import static org.junit.Assert.*;

import main.java.controller.user.UserController;
import main.java.model.user.ModelUser;
import main.java.controller.purchase.PurchaseController;
import main.java.controller.user.UserSearchController;

import org.junit.jupiter.api.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserControllerTest {

    private UserController userControllerTest = new UserController();
    private ModelUser modelUserTest = new ModelUser();
    private PurchaseController purchaseControllerTest = new PurchaseController();
    private UserSearchController userSearchControllerTest = new UserSearchController();


    @BeforeClass
    public void setUp() throws Exception {
        userControllerTest.create("Alexander", "Ovechkin", "13/03/1984");
    }

    @AfterClass
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        assertEquals(userSearchControllerTest.findUserByFirstNameModel("Alexander"), "Alexander");
//        assertEquals(purchaseControllerTest.findClientById(modelUserTest.getClientsList().size()).getSecondName(), "Ovechkin");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate localDate = LocalDate.parse("13/03/1984", formatter);
//        assertEquals(purchaseControllerTest.findClientById(modelUserTest.getClientsList().size()).getBirthDay(), localDate);
    }

    @Test
    public void delete() {
        modelUserTest.deleteUser(1);
        assertEquals(0, ModelUser.getClients().size());
    }
}