package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {

    private int id;
    private String name;
    private int age;
    private int enrollmentNumber;

    public Student(){}

    public Student(String name, int age, int enrollmentNumber) {
        this.name = name;
        this.age = age;
        this.enrollmentNumber = enrollmentNumber;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name = "enrollment_number")
    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }
}
