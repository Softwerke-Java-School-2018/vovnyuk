package model.user;

import entities.Builder;

import java.util.ArrayList;
import java.util.ListIterator;


public class ModelUser {

    private ArrayList<Builder> list = new ArrayList<>();

    public void addNext(Builder person) {
        this.list.add(person);
    }

    public ArrayList<Builder> getClients(){
        return list;
    }


    public void deleteUser(int idToDelete){
        ArrayList<Builder> entity = getClients();
        ListIterator<Builder> listIter = entity.listIterator();
        while (listIter.hasNext()){
            Builder next = listIter.next();
            if (idToDelete == next.getId()){
                listIter.remove();
            }
        }

    }

}