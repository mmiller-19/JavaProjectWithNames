package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your First name: ");
        String firstName = sc.next();

        System.out.println("Please enter your Last name: ");
        String lastName = sc.next();

        System.out.println("Hello " + firstName + " " + lastName);

        int LnthFirstName = firstName.length();
        int LnthLastName = lastName.length();
        int LnthFullName = LnthFirstName + LnthLastName;

        System.out.println("You have " + LnthFirstName + " letters in your first name");
        System.out.println("You have " + LnthLastName + " letters in your last name");
        System.out.println("You have " + LnthFullName + " letters in your full name");

    }
}

