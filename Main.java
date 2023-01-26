import java.util.*;import java.lang.*;import java.io.*;
public class Main
{
    public static int handshake(int n)
    {
        if (n == 0)
            return 0;
        else
            return (n - 1) + handshake(n - 1);
    }
    public static void main (String[] args) throws java.lang.Exception
    {


        Scanner n=new Scanner(System.in);
        int p=n.nextInt();
        System.out.println(handshake(p));
    }
}