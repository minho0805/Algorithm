import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> list = Arrays.asList(a, b, c);
        int maxVal = Collections.max(list);
        if ( a == b ) {
            if (a == c) {
                System.out.println(10000+(a*1000));
            }
            else {
                System.out.println(1000+(a*100));
            }
        }
        else if ( b == c ) {
            if (b == a) {
                System.out.println(10000+(b*1000));
            }
            else {
                System.out.println(1000+(b*100));
            }
        }
        else if ( c == a ) {
            if (c == b) {
                System.out.println(10000+(c*1000));
            }
            else {
                System.out.println(1000+(c*100));
            }
        }
        else {
            System.out.println(maxVal*100);
        }
        sc.close();
    }
}