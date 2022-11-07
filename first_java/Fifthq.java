package Assignments.first_java;

import java.util.Scanner;

public class Fifthq {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = yo.nextInt();

        System.out.print("Enter Second Number :");
        int num2 = yo.nextInt();
        if (num1<num2){
            System.out.println(num2 + " is the largest number");
        } else if (num1==num2) {
            System.out.println("Both the numbers you entered are equal!!");

        }
        else {
            System.out.println(num1 + " is the largest number");
        }
    }
}
