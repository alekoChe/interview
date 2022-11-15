package interview.lesson_1_1.builder;

import java.time.LocalDateTime;

public class Person {

    private Long id;
    private  String lastName;
    private String firstName;
    private String gender;
    private LocalDateTime birthDate;
    private String profession;
    private String tittle;

    private Person() {
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public String getProfession() {
        return profession;
    }

    public String getTittle() {
        return tittle;
    }

    public static class Builder {

        private final Person person;

        public Builder() {
            this.person = new Person();
        }

        public Builder withId(Long id) {
            this.person.id = id;
            return this; // возвращает билдер
        }

        public Builder withFirstName(String firstName) {
            this.person.firstName = firstName;
            return  this;
        }

        public Builder withLastName(String lastName) {
            this.person.lastName = lastName;
            return this;
        }

        public Builder withGender(String gender) {
            this.person.gender = gender;
            return this;
        }

        public Builder withBirthDate(LocalDateTime birthDate) {
            this.person.birthDate = birthDate;
            return this;
        }

        public Builder withProfession(String profession) {
            this.person.profession = profession;
            return  this;
        }

        public Builder withTittle(String tittle) {
            this.person.tittle = tittle;
            return this;
        }

        public Person build() {
            /** Возвращает класс который  мы строили;
             * здесь также размещается логика */
            return this.person;
        }
    }
}
