package model;

import java.util.ArrayList;
import java.util.List;

import entities.This;


public class DataTables {

    private List<This> listOfUsers = new ArrayList<>();


    public List<This> getUserList() {
        return listOfUsers;
    }


    public void showRealTable(){
        System.out.println(listOfUsers.size());
        for (int i = 0; i < listOfUsers.size(); i++){
            System.out.println(listOfUsers.get(i));
        }
    }

}
