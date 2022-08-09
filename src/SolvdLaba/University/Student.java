package SolvdLaba.University;

import java.util.Date;
//import javafx.application.Application;

public abstract class Student extends Person {

    private Person id;
    private Person age;
    private Person name;
    private Person faculty;
    private Date date;
    private String email;
    private Person placeOfResidence;



    // Student Ivan = new Student() {

    // }
    public Person getId() {
        return id;
    }

    public void setId(Person id) {
        this.id = id;
    }


    public Person getName() {
        return name;
    }

    public void setName(Person name) {
        this.name = name;
    }

    public Person getFaculty() {

        return faculty;
    }

    public void setFaculty(Person faculty) {

        this.faculty = faculty;
    }


    public void setEmail(String email) {

        this.email = email;
    }

    public String getEmail() {

        return email;
    }


    public Person getPlaceOfResidence() {

        return placeOfResidence;
    }

    public void setPlaceOfResidence(Person placeOfResidence) {

        this.placeOfResidence = placeOfResidence;
    }
    public Student(int id, String name, int age, String email, String placeOfResidence, String city) {
        super();
    }

    static Student pet = new Student(1, "Pe", 11, "gwrgwg", "Lviv", "Lviv") {
    };


    public static void main(String[] args) {
        System.out.println(pet.getName());
    }


}




