package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);
        // Display car details
        myCar.displayCarDetails();
        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);
        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayCarDetails();
        System.out.println("My Car Model is : " + myCar.getModel());

        // Create a new Bike object
        Bike bike = new Bike("BMW", "BMW 23", 20, "Black", 200020.22);
        bike.displayBikeDetails();
        System.out.println("Get Bike Name using Gattre : " + bike.getBrand());

        // Create a new Bank object
        Bank bank = new Bank("SBI Vishnupuri", "Sayyad Soheb", "6249982343", 3000.30);
        bank.displayAccountDetails();
        System.out.println("Enter The Amount You want To Deposit");
        double amount = scanner.nextDouble();
        bank.deposit(amount);
        System.out.println("Enter The Amount You want to Withdraw : ");
        amount = scanner.nextDouble();
        bank.withdraw(amount);

        // Create a new Studetnt object
        Student student = new Student("SOHEB", 25, "L050308", "Computer Science");
        student.displayStudentDetails();
        student.setName("Mohammad Soheb");
        student.setMajor("CSE");
        student.displayStudentDetails();

    }
}
