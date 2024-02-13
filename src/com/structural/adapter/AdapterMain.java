package com.structural.adapter;

/*
Make generic notification system using Adapter design pattern
 */

import java.util.ArrayList;
import java.util.List;

interface Student{
    String getName();
    String getSurName();

    String getEmail();
}

class CollegeStudent implements Student{
    String name;
    String surName;
    String email;
    public CollegeStudent(String name,String surName,String email){
        this.name=name;
        this.surName=surName;
        this.email=email;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurName() {
        return surName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


class SchoolStudent{

    String firstName;
    String lastName;
    String email;


    public SchoolStudent(String firstName,String lastName,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


class SchoolStudentAdapter implements Student{
    SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent=schoolStudent;
    }


    @Override
    public String getName() {
        return "adapted "+schoolStudent.getFirstName();
    }

    @Override
    public String getSurName() {
        return "adapted "+schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return "adapted "+schoolStudent.getEmail();
    }

    @Override
    public String toString() {
        return "SchoolStudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}

class StudentClient{


    public List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("alex","blue","alexblue@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("door","dash","doordash@gmail.com");

        studentList.add(collegeStudent);
        studentList.add(new SchoolStudentAdapter(schoolStudent));
        return studentList;
    }
}

public class AdapterMain {
    public static void main(String[] args) {


        StudentClient studentClient = new StudentClient();
        List<Student> students = studentClient.getStudentList();


        System.out.println(students);





    }
}
