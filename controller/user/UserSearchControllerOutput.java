package controller.user;

import entities.builders.Builder;

class UserSearchControllerOutput {

    void userSearchControllerOutput(Builder user){

        System.out.println("Id:" + user.getId());
        System.out.println("First name:" + user.getFirstName());
        System.out.println("Second name:" + user.getSecondName());
        System.out.println("Birthday:" + user.getBirthDay());
    }


}
