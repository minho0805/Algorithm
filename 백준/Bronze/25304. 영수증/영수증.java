import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long sum =0;
        int N = sc.nextInt();

        for (int i=0; i<N; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }

        if (X==sum) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}