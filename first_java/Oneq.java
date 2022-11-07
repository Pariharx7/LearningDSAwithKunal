package Assignments.first_java;

import java.util.Scanner;

public class Oneq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println(num +" " + "is Even");
        }
        else {
            System.out.println(num +" " + "is Odd");
        }

    }
}
