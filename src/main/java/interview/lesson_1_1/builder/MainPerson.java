package interview.lesson_1_1.builder;

import java.time.LocalDateTime;

public class MainPerson {

    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .withLastName("Rurykov")
                .withFirstName("Ivan")
                .withMiddleName("Vasylyevich")
                .withGender("M")
                .withAge(33)
                .withAddress("Moscow, Kremlin")
                .withCountry("Russia")
                .withPhone("112")
                .build();

        Person person2 = new Person.Builder()
                .withLastName("Ivan")
                .withFirstName("Johnson")
                .withAge(33)
                .build();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
