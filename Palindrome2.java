package _27_JAN_2023;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string or number");
        String original= sc.nextLine();
        String rev="";
        int count= original.length();
        for (int i = count-1; i >=0; i--) {
            rev=rev+original.charAt(i);
        }

        if (original.equals(rev))
            System.out.println(original+" is Palindrome");
        else
            System.out.println(original+" its not Palindrome");
    }
}
