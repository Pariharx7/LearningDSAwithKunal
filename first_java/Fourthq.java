package Assignments.first_java;

import java.util.Scanner;

public class Fourthq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        System.out.print("Enter one of the Operators(+,-,*,/) : ");
        char op = input.next().charAt(0);

        if (op=='+'){
            System.out.println(num1 + " + " + num2 + "=" + " " +(num1+num2) );
        }
        if (op=='-'){
            System.out.println(num1 + " - " + num2 + "=" + " " +(num1-num2) );
        }
        else  if (op=='*'){
            System.out.println(num1 + " * " + num2 + "=" + " " +(num1*num2) );
        }
        else  if (op=='/'){
            System.out.println(num1 + " / " + num2 + "=" +" " +(num1/num2) );
        }
    }
}
