package _28_JAN_2023;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("Enter starting  number you want");
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        System.out.println("Enter Ending and how many number you want");

        int end=sc.nextInt();
        System.out.println("Enter how many number you want");

        int number=sc.nextInt();
        for (int i = 0; i < number; i++) {

            System.out.println((int)(Math.random()*Math.pow(10,count(end))));

        }

    }
    public static int count(int number){
        int digit =0;
        while (number>0){
            number=number/10;
            digit++;
        }
        return digit;
    }
}
