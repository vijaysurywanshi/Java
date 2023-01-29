package _29_JAN_2023_;

import java.util.Scanner;

public class CharAlphaOrNot {

    public static void main(String[] args) {
        System.out.println("Enter Alphabet");
        Scanner sc =new Scanner(System.in);
        char aplhabet = sc.next().charAt(0);


        if (aplhabet >='a' && aplhabet<='z') {
            System.out.println("Given charecter is in Small Case");
        }
        else
            System.out.println("Given charecter is in Upper Case");


    }
}
