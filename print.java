import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        System.out.println("how many number u want in line");
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        int a=1;
        while (a<=num){
            System.out.print(a+" ");
            a++;
        }
    }
}
