package Assignments.first_java;

import java.util.Scanner;

public class Sixthq {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter the Amount Rs:");
        double INR = so.nextDouble();

        double USD = 0.013*INR;
        System.out.println("Rs :" +INR + " is equal to " + USD +" " +"USD");


    }
}

