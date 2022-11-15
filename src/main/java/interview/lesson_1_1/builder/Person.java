package interview.lesson_1_1.builder;

import java.time.LocalDateTime;

public class Person {

    private  String lastName;
    private String firstName;
    private String  middleName;
    private int age;
    private String gender;
    private String country;
    private String address;
    private String phone;

    private Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder {

        private final Person person;

        public Builder() {
            this.person = new Person();
        }

        public Builder withFirstName(String firstName) {
            this.person.firstName = firstName;
            return  this;
        }

        public Builder withLastName(String lastName) {
            this.person.lastName = lastName;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            this.person.middleName = middleName;
            return this;
        }

        public Builder withAge(int age) {
            this.person.age = age;
            return this;
        }

        public Builder withGender(String gender) {
            this.person.gender = gender;
            return this;
        }

        public Builder withCountry(String country) {
            this.person.country = country;
            return this;
        }

        public Builder withAddress(String address) {
            this.person.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            this.person.phone = phone;
            return this;
        }

        public Person build() {
            /** Возвращает класс который  мы строили;
             * здесь также размещается логика */
            return this.person;
        }
    }
}
