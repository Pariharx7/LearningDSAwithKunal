package Assignments.first_java;

import java.util.Scanner;

public class Ninthq {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two values between which you wanted to find the Armstrong Number :");
        int start =sc.nextInt();
        int end = sc.nextInt();
        int i,temp1,temp2,rem,n=0,res=0;
        for(i=start+1;i<end;++i){
            temp2=i;
            temp1=i;

            while(temp1 != 0){
                temp1 /= 10;
                ++n;
            }
            while(temp2 != 0){
                rem = temp2 % 10;
                res+=Math.pow(rem,n);
                temp2 /= 10;

            }
            if(res==i){
                System.out.println(i + " ");
            }
            n=0;
            res=0;
        }
    }
}
