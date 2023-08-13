package lexicon.se;

import java.sql.SQLOutput;

public class Person {

    private int personId;
    private String firstName;
    private String lastName;
    private int age;
    private String SSn;
    private boolean Statuse;

    // Constructors
    public Person() {
    }

    public Person(int Person, String firstName, String lastName, int age, boolean status) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(lastName);
        this.Statuse= Statuse;


    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;


        public String setFirstName() {
            if (firstName == null)
                this.firstName = firstName;
        }
    }


    public String getLastName() {
        return lastName;
    }

    public String setLastName() {
        if (lastName == null) ;
        this.lastName = lastName;

        public String personInfo() {
            return " Person {Name: " + firstName + " " + lastName + ", SSN: " + SSn + " }";

        }
    }
}


