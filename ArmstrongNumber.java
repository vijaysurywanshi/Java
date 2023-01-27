package _27_JAN_2023;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int comp = number,last = 0, sum = 0;

        while (number > 0) {
            last = number % 10;
            sum = sum + (int) pow(last, count(comp));
            number = number / 10;
        }
        if (comp == sum)
            System.out.println(sum + "  is Armstrong");
        else
            System.out.println(sum + "  is NOT  Armstrong");
    }
    public static int count(int number2) {
        int digit = 0;
        while (number2 > 0) {
            number2 = number2 / 10;
            digit++;
        }
        return digit;
    }
}