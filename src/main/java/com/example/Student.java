package com.example;

// Starter code for Student class
public class Student {
    // Attributes
    private String name;
    private int age;
    private String studentId;
    private String major;

    // Add a constructor here
    public Student(String name, int age, String studentId, String major) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Student ID :" + studentId);
        System.out.println("Major :" + major);
        // TODO: Implement this method
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
}
