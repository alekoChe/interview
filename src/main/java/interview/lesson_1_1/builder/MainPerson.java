package interview.lesson_1_1.builder;

import java.time.LocalDateTime;

public class MainPerson {

    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .withId(1L)
                .withLastName("Ivan")
                .withFirstName("Johnson")
                .withGender("M")
                .withBirthDate(LocalDateTime.now().minusYears(25))
                .withProfession("freser")
                .withTittle("4-degree")
                .build();

        Person person2 = new Person.Builder()
                .withLastName("Ivan")
                .withFirstName("Johnson")
                .withProfession("freser")
                .build();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
