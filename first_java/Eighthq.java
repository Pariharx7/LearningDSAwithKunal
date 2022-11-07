package Assignments.first_java;

import java.util.Scanner;

public class Eighthq {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String a,b="";
        System.out.println("Enter the String you want to check: ");
        a = input.nextLine();
        int n = a.length();
        for(int i=n-1;i>=0;i--){
            b=b+a.charAt(i);

        }
        if(a.equals(b)){
            System.out.println("The string you entered is a Palindrome!!");
        }
        else{
            System.out.println("The given string isn't a Palindrome");
        }
    }
}
