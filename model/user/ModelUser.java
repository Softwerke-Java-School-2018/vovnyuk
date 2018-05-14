package model.user;

import entities.builders.Builder;

import java.util.ArrayList;
import java.util.ListIterator;


public class ModelUser {

    private static ArrayList<Builder> list = new ArrayList<>();

//    public static void addNext(Builder person) {
//        this.list.add(person);
//    }

    public static ArrayList<Builder> getClients() {
        return list;
    }


    public void deleteUser(int idToDelete) {
        ArrayList<Builder> entity = getClients();
        ListIterator<Builder> listIter = entity.listIterator();
        int initialSize = entity.size();
        while (listIter.hasNext()) {
            Builder next = listIter.next();
            if (idToDelete == next.getId()) {
                listIter.remove();
                System.out.println("User has been successfully removed");
            }
        }
        if (initialSize == entity.size()) {
            System.out.println("There is no user with such id(" + idToDelete + ")");
        }

    }
}