import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int H;
        int M;

        if (m >= 45) {
            M = m - 45;
            H = h;
        } else {
            M = m + 15;
            if (h == 0) {
                H = 23;
            } else {
                H = h - 1;
            }
        }

        System.out.println(H + " " + M);
        sc.close();
    }
}