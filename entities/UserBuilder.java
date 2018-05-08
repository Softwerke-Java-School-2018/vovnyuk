package entities;

import model.DataTables;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class UserBuilder {
    private List<This> list = DataTables.getInstance().getInstanceList();

    public void addNext(String firstName, String secondName, LocalDate localDate) {
        list.add(This.builder()
                .firstName(firstName)
                .secondName(secondName)
                .birthDay(localDate)
                .build());
        System.out.println("User was successfully added");
    }

    public Stream<This> findAll(){
        return list.stream();
    }
}
