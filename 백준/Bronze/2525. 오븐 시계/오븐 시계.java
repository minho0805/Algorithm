import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int H;
        int M;

        if ((m+t)>=60) {
            M = (m+t)%60;
            H = h+(m+t)/60;
        }
        else {
            H = h;
            M = m+t;
        }
        H = H%24;

        System.out.println(H + " " + M);
        sc.close();
    }
}