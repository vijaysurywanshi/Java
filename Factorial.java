package _27_JAN_2023;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter Factorial number");
        Scanner sc =new Scanner(System.in);
        int fact= sc.nextInt();
        int sum=1;
        while (fact>0){
            sum=sum*fact;
            fact--;
        }
        System.out.println("Factorial is  "+sum);
    }
}
