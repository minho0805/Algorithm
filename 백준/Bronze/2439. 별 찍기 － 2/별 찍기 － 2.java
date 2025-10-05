import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 1; i<count+1; i++) {
            for (int j = count; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<i;  k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}