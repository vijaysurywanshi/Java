import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter number \n");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();           //12345

        int rem=0;

        while (num!=0){
            rem=rem*10+num%10;
            num=num/10;

        }
        System.out.print("Reverse number is "+rem);


    }
}
