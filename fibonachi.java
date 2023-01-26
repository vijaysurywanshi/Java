import java.util.Scanner;

public class fibonachi {

    static int num1=0,num2=1,num3=0;

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
       // int num1=0,num2=1;

        System.out.print(num1+" "+num2+" ");

        fibo(num-2);

        }

        static void fibo(int num){

            if (num>0){
                num3=num1+num2;
                num1=num2;
                num2=num3;
                System.out.print(" "+num3+" ");
                fibo(num-1);

            }


        }
    }



