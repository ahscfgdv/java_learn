package com.itheima;

public class Student {

    // Attributes (member variables)
    private String name;
    private int age;
    private double gpa;
    public static final String Country = "China";

    public Student() {
        System.out.println("Student no param Constructor");
    }

    // Constructor (to initialize student objects)
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void write() {
        System.out.println("Student write");
    }

    public void read() {
        System.out.println("Student read");
    }

    private String fight() {
        return " is fighting";
    }

    private String fight(String name) {
        return name + " is fighting";
    }

    // Getters (accessor methods)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters (mutator methods)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString method (to print student information)
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", gpa=" + gpa + '}';
    }
}

