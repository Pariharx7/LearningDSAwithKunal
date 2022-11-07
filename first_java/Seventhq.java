package Assignments.first_java;

import java.util.Scanner;

public class Seventhq {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sum=0, n;
        int a=0;
        int b=1;
        System.out.println("Enter the nth value: ");
        n = input.nextInt();
        System.out.println("Fibonacci series: ");
        while(sum <= n){
            System.out.println(sum + " ");
            a = b;
            b =sum;
            sum =a +b;
        }


    }
}
