package entities;

import java.time.LocalDate;

public class This {

    private final String firstName;
    private final String secondName;
    private final LocalDate birthDay;

    private This(String firstName, String secondName, LocalDate birthDay){
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDay = birthDay;
    }

    public static ThisBuilder builder(){
        return new ThisBuilder();
    }

    public static class ThisBuilder{
        private String firstName;
        private String secondName;
        private LocalDate birthDay;

        private ThisBuilder(){

        }

        public ThisBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ThisBuilder secondName(String secondName){
            this.secondName = secondName;
            return this;
        }

        public ThisBuilder birthDay(LocalDate birthDay){
            this.birthDay = birthDay;
            return this;
        }

        public This build() {
            return new This(firstName, secondName, birthDay);
        }
    }
}
