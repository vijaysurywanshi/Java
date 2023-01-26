import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Enter table number");
        Scanner sc =new Scanner(System.in);
        int tab= sc.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(tab+" X "+" "+i+" =  "+tab*i);
        }
    }
}
