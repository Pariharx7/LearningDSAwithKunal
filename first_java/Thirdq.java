package Assignments.first_java;

import java.util.Scanner;

public class Thirdq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Rs:");
        float num=input.nextFloat();

        System.out.print("Enter the time in years : ");
        float time=input.nextFloat();

        System.out.print("Enter the rate : ");
        float rate=input.nextFloat();

       float ans =(num*time*rate)/100;
        System.out.println("Simple Interest is: "+ ans);


    }
}
