package _27_JAN_2023;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int rem=0;
        while (num>0){
            rem=rem*10+num%10;
            num=num/10;
        }
        if (original==rem) {
            System.out.println(rem+"  number is Palindrome");
        }
        else
            System.out.println(rem+"  number is not Palindrome");

    }
}
