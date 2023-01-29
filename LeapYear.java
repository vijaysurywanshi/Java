package _29_JAN_2023_;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int count = 0;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    count = 1;

                } else count = 0;


            } else count = 1;

        } else count = 0;


        if (count == 0) {
            System.out.println("Year is not leap year");

        } else System.out.println("Year is leap year");

    }
}
