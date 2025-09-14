import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hundred = b/100;
        int ten = (b%100)/10;
        int one = b%10;
        int result = a*b;
        System.out.println(a*one);
        System.out.println(a*ten);
        System.out.println(a*hundred);
        System.out.println(result);

        sc.close();
    }
}