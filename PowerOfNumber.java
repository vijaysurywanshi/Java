package _31_JAN_2023;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter base Number");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter Exponent");
        int expo = sc.nextInt();
        int pow = 1, dubli = base;
        while (pow < expo) {
            base = base * dubli;
            pow++;
        }
        System.out.println("Power is " + base);
    }
}
