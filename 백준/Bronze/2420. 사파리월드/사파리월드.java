import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        long a = input.nextInt();
        long b = input.nextInt();
        System.out.println(Math.abs(a-b));
    }
}