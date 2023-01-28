package _28_JAN_2023;

import java.util.Scanner;

public class RandomNumber2 {
    public static void main(String[] args) {
        System.out.println("Enter Starting ");
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        System.out.println("Enter Ending ");
        int end =sc.nextInt();

        System.out.println((int)(Math.random()*(end-start+1))+start);

    }
}
