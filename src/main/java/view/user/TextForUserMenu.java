package main.java.view.user;

class TextForUserMenu {

    private final static String stringUserMenu = "User menu. Choose what you want to do:" + "\n" +
            "1. Add user" + "\n" +
            "2. Find user" + "\n" +
            "3. Show list of users" + "\n" +
            "4. Delete user" + "\n" +
            "5. Sort list of users" + "\n" +
            "6. Exit";

    private final static String stringUserFindMenu = "User search menu. Select the attribute by which you want to search:"
            + "\n" +
            "1. By Id" + "\n" +
            "2. By first name" + "\n" +
            "3. By second name" + "\n" +
            "4. By birthday" + "\n" +
            "5. Exit";

    private final static String stringUserSortMenu = "User sort menu. Select the attribute by which you want to sort:" + "\n" +
            "1. By first name" + "\n" +
            "2. By second name" + "\n" +
            "3. By birthday" + "\n" +
            "4. Exit";

    void userMenu(){
        System.out.println(stringUserMenu);
    }
    void userFindMenu(){
        System.out.println(stringUserFindMenu);
    }
    void userSortMenu(){
        System.out.println(stringUserSortMenu);
    }

}
